//package con.feereport;
public class Student
{
	String name,email,corse,contact_no,city;
	int fees,paid,due;
	Student(){}
	Student(String name,String email,String corse,String contact_no,String city,int fees,int paid,int due)
	{
		this.name=name;
		this.email=email;
		this.corse=corse;
		this.contact_no=contact_no;
		this.city=city;
		this.fees=fees;
		this.paid=paid;
		this.due=due;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public void setCorse(String corse)
	{
		this.corse=corse;
	}
	public void setContactNo(String contact_no)
	{
		this.contact_no=contact_no;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public void setFees(int fees)
	{
		this.fees=fees;
	}
	public void setPaid(int paid)
	{
		this.paid=paid;
	}
	public void setDue(int due)
	{
		this.due=due;
	}
	public String getName()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}
	public String getCorse()
	{
		return corse;
	}
	public String getContactNo()
	{
		return contact_no;
	}
	public String getCity()
	{
	      return city;
	}
	public int getFees()
	{
		return fees;
	}
	public int getPaid()
	{
		return paid;
	}
	public int  getDue()
	{
		return due;
	}
}