//package con.feereport;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FeeReport extends JFrame
{
	JButton b1,b2;
	JLabel l;
	public FeeReport(String s)
	{
		super(s);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,300);
		l=new JLabel("FeeReport");
		l.setBounds(200,20,200,50);
		b1=new JButton("Admin Login");
		b2=new JButton("Accountant Login");
		b1.setBounds(130,80,200,50);
		b2.setBounds(130,160,200,50);
		add(b1);
		add(b2);
		add(l);
		b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){AdminLogin.main(new String[]{});}});
		b2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){AccountantLogin.main(new String[]{});}});
	}
	public static void main(String[]args)
	{
		new FeeReport("Priyansh");
	}
}