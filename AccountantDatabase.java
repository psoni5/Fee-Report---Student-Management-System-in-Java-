//package con.feereport;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class AccountantDatabase
{
	public static Connection getCon()throws Exception
	{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:scott","hr","hr");
		return con;
	}
	public static int save(Accountant a)throws Exception
	{
	    Connection con=getCon();
		java.sql.PreparedStatement pst= con.prepareStatement("insert into Accountant values(?,?,?,?,?)");
		pst.setInt(1,a.getId());
		pst.setString(2,a.getName());
		pst.setString(3,a.getPassword());
		pst.setString(4,a.getEmail());
		pst.setString(5,a.getContactNo());
		int status=pst.executeUpdate();
		con.close();
		return status;
		
	}
	public static boolean validate(String name,String password)throws Exception
	{
		Connection con=getCon();
		PreparedStatement pst=con.prepareStatement("select * from Accountant where name=? and password=?");
		pst.setString(1,name);
		pst.setString(2,password);
		ResultSet rs=pst.executeQuery();
		boolean status=rs.next();
		con.close();
		return status;
	}
	public static List <Accountant> view() throws Exception
	{
		List <Accountant> l=new ArrayList<>();
		Connection con=getCon();
		PreparedStatement pst=con.prepareStatement("select * from Accountant");
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			Accountant a=new Accountant();
			a.setId(rs.getInt(1));
			a.setName(rs.getString(2));
			a.setPassword(rs.getString(3));
			a.setEmail(rs.getString(4));
			a.setContactNo(rs.getString(5));
			l.add(a);
			
		}
		con.close();
		return l;
	}
}