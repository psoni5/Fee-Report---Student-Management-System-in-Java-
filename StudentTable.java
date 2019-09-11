import java.sql.*;
public class StudentTable
{
    public static void main(String[]args)throws Exception
    {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:scott","hr","hr");
        String sqlquery="create table Student(name varchar2(10),email varchar2(30),corse varchar2(20),fees number(10),paid number(10),due number(10),contact_no varchar2(10),city varchar2(10))";
        Statement st=con.createStatement();
        st.executeUpdate(sqlquery);
        System.out.println("table created");
        con.close();

            }
}
