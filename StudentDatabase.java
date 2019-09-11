//package con.feereport;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class StudentDatabase
{
	public static Connection getCon()throws Exception
	{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:scott","hr","hr");
		return con;
	}
	public static int save(Student s)throws Exception
	{
		Connection con=getCon();
		java.sql.PreparedStatement pst=con.prepareStatement("insert into Student values(?,?,?,?,?,?,?,?)");
		pst.setString(1,s.getName());
		pst.setString(2,s.getEmail());
		pst.setString(3,s.getCorse());
		pst.setInt(4,s.getFees());
		pst.setInt(5,s.getPaid());
		pst.setInt(6,s.getDue());
		pst.setString(7,s.getContactNo());
		pst.setString(8,s.getCity());
		int status= pst.executeUpdate();
		con.close();
		return status;
	}
	public static int update(Student s)throws Exception
	{
	   Connection con=getCon();
		java.sql.PreparedStatement pst=con.prepareStatement("update Student set name=?,email=?,corse=?,fees=?,paid=?,due=?,contact_no=?,city=? where name=?");
		pst.setString(1,s.getName());
		pst.setString(2,s.getEmail());
		pst.setString(3,s.getCorse());
		pst.setInt(4,s.getFees());
		pst.setInt(5,s.getPaid());
		pst.setInt(6,s.getDue());
		pst.setString(7,s.getContactNo());
		pst.setString(8,s.getCity());
		pst.setString(9,s.getName());
		int status= pst.executeUpdate();
		con.close();
		return status;	
	}
	public static List <Student> due()throws Exception
	{
		Connection con=getCon();
		java.sql.PreparedStatement pst=con.prepareStatement("Select * from student where due>0");
		ResultSet rs=pst.executeQuery();
		List <Student> l=new ArrayList<>();
		while(rs.next())
		{
			Student s=new Student();
			s.setName(rs.getString(1));
			s.setEmail(rs.getString(2));
			s.setCorse(rs.getString(3));
			s.setFees(rs.getInt(4));
			s.setPaid(rs.getInt(5));
			s.setDue(rs.getInt(6));
			s.setContactNo(rs.getString(7));
			s.setCity(rs.getString(8));
			l.add(s);
		}
		con.close();
		return l;
	}
	public static List <Student> view()throws Exception
	{
		Connection con=getCon();
		java.sql.PreparedStatement pst=con.prepareStatement("select * from Student");
		ResultSet rs=pst.executeQuery();
		List <Student> l=new ArrayList<>();
		while(rs.next())
		{
			Student s=new Student();
			s.setName(rs.getString(1));
			s.setEmail(rs.getString(2));
			s.setCorse(rs.getString(3));
			s.setFees(rs.getInt(4));
			s.setPaid(rs.getInt(5));
			s.setDue(rs.getInt(6));
			s.setContactNo(rs.getString(7));
			s.setCity(rs.getString(8));
			l.add(s);
		}
		con.close();
		return(l);
	}
}