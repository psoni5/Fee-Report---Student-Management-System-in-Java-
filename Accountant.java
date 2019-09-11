//package con.feereport;

public class Accountant
{
	 String name;
	 String email;
	 String contact_no;
	 int id;
	 String password;
	 Accountant()
	{
		
	}
    Accountant(String name,String email,String contact_no,int id,String password)
	{
	   
		this.name=name;
		this.email=email;
		this.contact_no=contact_no;
		this.id=id;
		this.password=password;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setContactNo(String contact_no)
	{
		this.contact_no=contact_no;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public String getName()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}
	public int getId()
	{
		return id;
	}
	public String getPassword()
	{
		return password;
	}
	public String getContactNo()
	{
		return contact_no;
	}
}