import java.sql.*;
public class AccountantTable
{
    public static void main(String[]args)throws Exception
    {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:scott","hr","hr");
        String sqlquery="create table Accountant(id number(10),name varchar2(10),password varchar2(10),email varchar2(30),contact_no varchar2(10))";
        Statement st=con.createStatement();
        st.executeUpdate(sqlquery);
        System.out.println("table created");
        con.close();

            }
}
