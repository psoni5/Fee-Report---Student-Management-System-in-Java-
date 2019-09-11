//package con.feereport;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AdminSection extends JFrame
{
	JLabel l;
	JButton b,b1;
	AdminSection(String s)
	{
		super(s);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setBounds(200,100,500,300);
		
		b=new JButton("Add Accountant");
		b1=new JButton("View Accountant");
		l=new JLabel("Admin Section");
		l.setBounds(200,30,200,30);
		b.setBounds(150,80,150,30);
		b1.setBounds(150,120,150,30);
		add(l);
		add(b);
		add(b1);
		String[]args=new String[4];
		b.addActionListener(new ActionListener()
		{
		 public void actionPerformed(ActionEvent e)
		 {
		     AddAccountant.main(args);
			 
	    }}
		);
		b1.addActionListener(new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
			{
			    try{
			    ViewAccountant.main(args);
				}
				catch(Exception q)
				{
					q.printStackTrace();
				}
				
				}});
		
	}
	public static void main(String[]args)
	{
		AdminSection as=new AdminSection("as");
	}
}