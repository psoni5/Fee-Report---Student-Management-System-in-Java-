//package con.feereport;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AccountantSection extends JFrame
{
	JLabel l;
	JButton b,b1,b2,b3,b4,b5;
	AccountantSection(String s)
	{
		super(s);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,500,350);
		l=new JLabel("Accountant Section");
		b=new JButton("Add Student");
		b1=new JButton("View Student");
		b2=new JButton("Edit Student");
		b3=new JButton("Due Fees");
		b4=new JButton("Logout");
		l.setBounds(200,20,150,30);
		b.setBounds(100,80,130,30);
		b1.setBounds(250,80,130,30);
		b2.setBounds(100,150,130,30);
		b3.setBounds(250,150,130,30);
		b4.setBounds(180,230,130,30);
		add(l);
		add(b);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			   String[]args=new String[4];
				AddStudent.main(args);
				dispose();
			}
		});
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			   String[]args=new String[4];
			   try{
				ViewStudent.main(args);
				dispose();
				}
				catch(Exception q)
				{
					System.out.println("Exception");
				}
			}
		});
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			    String[]args=new String[4];
				EditStudent.main(args);
				dispose();
			}
		});
		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			   String[]args=new String[4];
			   try{
				DueFees.main(args);
				dispose();
			}
			catch(Exception q)
			{
				System.out.println("Exception");
			}
			}
		});
		b4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			    String[]args=new String[4];
				FeeReport.main(args);
			 dispose();
			}
		});
	}
	public static void main(String[]args)
	{
		new AccountantSection("as");
	}
}