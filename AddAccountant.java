//package con.feereport;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AddAccountant extends JFrame
{
	JLabel l,l1,l2,l3,l4,l5;
	JTextField f,f1,f2,f3,f4;
	JButton b;
	AddAccountant(String s)
	{
		super(s);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setBounds(100,60,450,500);
		l=new JLabel("Add Accountant");
		l1=new JLabel("Name");
		l2=new JLabel("Password");
		l3=new JLabel("id");
		l4=new JLabel("Email");
		l5=new JLabel("Contact NO");
		f=new JTextField();
		f1=new JTextField();
		f2=new JTextField();
		f3=new JTextField();
		f4=new JTextField();
		b=new JButton("ADD");
		l.setBounds(150,20,100,30);
		l1.setBounds(50,100,80,30);
		f.setBounds(150,100,200,30);
		l2.setBounds(50,150,80,30);
		f1.setBounds(150,150,200,30);
		l3.setBounds(50,200,80,30);
		f2.setBounds(150,200,200,30);
		l4.setBounds(50,250,80,30);
		f3.setBounds(150,250,200,30);
		l5.setBounds(50,300,80,30);
		f4.setBounds(150,300,200,30);
		b.setBounds(180,380,100,30);
		add(l);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(f);
		add(f1);
		add(f2);
		add(f3);
		add(f4);
		add(b);
		
		b.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
		{
		    String name=f.getText();
		String password=f1.getText();
		int id= Integer.parseInt(f2.getText());
		String email=f3.getText();
		String contact_no=f4.getText();
		     Accountant a=new Accountant(name,email,contact_no,id,password);
			 try{
			int status= AccountantDatabase.save(a);
			 if(status>0)
			 {
			 JOptionPane.showMessageDialog(AddAccountant.this,"Record successfully saved");
			 }
			 else
			 {
			 JOptionPane.showMessageDialog(AddAccountant.this,"Not saved");
			 f.setText("");f1.setText("");f2.setText("");f3.setText("");f4.setText("");
			 }
			 }
			 catch(Exception q)
			 {
			 	q.printStackTrace();;
			 }
		}});
	}
	public static void main(String[]args)
	{
		new AddAccountant("adac");
	}
}