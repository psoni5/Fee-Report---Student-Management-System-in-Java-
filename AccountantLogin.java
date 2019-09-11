//package con.feereport;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AccountantLogin extends JFrame
{
	JLabel l,l1,l2;
	JTextField f;
	JPasswordField f1;
	JButton b;
	AccountantLogin(String s)
	{
		super(s);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,400);
		setLayout(null);
		l=new JLabel("Accountant Login");
		l1=new JLabel("User Name");
		l2=new JLabel("Password");
		f=new JTextField();
		f1=new JPasswordField();
		l.setBounds(130,20,100,30);
		l1.setBounds(50,80,80,30);
		f.setBounds(150,80,170,30);
		l2.setBounds(50,150,80,30);
		f1.setBounds(150,150,170,30);
		b=new JButton("Login");
		b.setBounds(150,250,100,30);
		add(l);
		add(l1);
		add(l2);
		add(f);
		add(f1);
		add(b);
		b.addActionListener(new ActionListener()
		{
		     public void actionPerformed(ActionEvent e)
			 {
			 	String name=f.getText();
				String password=String.valueOf(f1.getPassword());
				System.out.println(name+" "+password);
				try{
				if(AccountantDatabase.validate(name,password))
				{
				     String []s=new String[4];
				  AccountantSection.main(s);
				  dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(AccountantLogin.this,"Wrong Username/password!!");
					f.setText("");f1.setText("");
				}
				}
				catch(Exception q)
				{
					System.out.println(q);
				}
			 }
		}
		);
	}
	public static void main(String[]args) 
	{
		new AccountantLogin("alg");
	}
}