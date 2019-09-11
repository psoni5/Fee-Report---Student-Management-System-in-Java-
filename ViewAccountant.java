//package con.feereport;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
public class ViewAccountant extends JFrame
{
    ViewAccountant(String s)throws Exception
	{ 
	   super(s);
		setVisible(true);
		//setLayout(null);
		
		List<Accountant>l=AccountantDatabase.view();
		int size=l.size();
		String data[][]=new String [size][5];
		int row=0;
		for(Accountant a:l)
		{
		    System.out.println(a.getName());
			data[row][0]=String.valueOf(a.getId());
			data[row][1]=a.getName();
			data[row][2]=a.getPassword();
			data[row][3]=a.getEmail();
			data[row][4]=a.getContactNo();
			row++;
		}
		String jc[]={"id","Name","Password","Email","Contact_NO"};
		JTable jt=new JTable(data,jc);
		JScrollPane sp=new JScrollPane(jt);
		add(sp);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100,100,800,400);
	}
	public static void main(String[]args)throws Exception
	{
		new ViewAccountant("");
	}
}