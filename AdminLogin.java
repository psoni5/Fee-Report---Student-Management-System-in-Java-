//package con.feereport;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AdminLogin extends JFrame
{
	JLabel l,l1,l2;
	JTextField f;
	JPasswordField f1;
	JButton b;
	AdminLogin(String s)
	{
		super(s);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setBounds(100,100,450,300);
		l=new JLabel("AdminLogin");
		l1=new JLabel("UserName");
		l2=new JLabel("password");
		f=new JTextField();
		f1=new JPasswordField();
		l.setBounds(200,20,200,50);
		l1.setBounds(100,80,150,30);
		l2.setBounds(100,120,150,30);
		f.setBounds(200,80,120,30);
		f1.setBounds(200,120,120,30);
		b=new JButton("Login");
		b.setBounds(150,200,100,30);
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
		char ch[]=f1.getPassword();
		String password=String.valueOf(ch);
		if(name.equals("priyansh") && password.equals("soni"))
		{
			AdminSection.main(new String[]{});
			dispose();
		}
		else
		{
		JOptionPane.showMessageDialog(AdminLogin.this,"sorry!! wrong Username/Password");
		f.setText("");
		f1.setText("");
		}
			}
		}
		);
		
	}
	public static void main(String[]args)
	{
		new AdminLogin("ad");
	}
}