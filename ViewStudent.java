//package con.feereport;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
public class ViewStudent extends JFrame
{
    ViewStudent(String y)throws Exception
	{ 
	   super(y);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100,100,1000,400);
		//setLayout(null);
		List <Student>l = StudentDatabase.view();
		int size=l.size();
		String data[][]=new String [size][8];
		int row=0;
		for(Student s:l)
		{
		     System.out.println(s.getEmail());
			data[row][0]=s.getName();
			data[row][1]=s.getEmail();
			data[row][2]=s.getCorse();
			data[row][3]=String.valueOf(s.getFees());
			data[row][4]=String.valueOf(s.getPaid());
			data[row][5]=String.valueOf(s.getDue());
			data[row][6]=s.getContactNo();
			data[row][7]=s.getCity();
			row++;
		}
		String jc[]={"Name","Email","Corse","Fees","Paid","Due","Contact_NO","City"};
		JTable jt=new JTable(data,jc);
		JScrollPane sp=new JScrollPane(jt);
		add(sp);
	}
	public static void main(String[]args) throws Exception
	{
		new ViewStudent("");
	}
}