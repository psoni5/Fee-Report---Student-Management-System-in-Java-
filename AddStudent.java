//package con.feereport;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AddStudent extends JFrame
{
	JLabel [] jl=new JLabel[9];
	JTextField [] jt=new JTextField[8];
	JButton b;
	AddStudent(String s)
	{
		super(s);
		setVisible(true);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,400,600);
		jl[0]=new JLabel("Add Student");
		jl[1]=new JLabel("Name");
		jl[2]=new JLabel("Email");
		jl[3]=new JLabel("Corse");
		jl[4]=new JLabel("Fees");
		jl[5]=new JLabel("Paid");
		jl[6]=new JLabel("Due");
		jl[7] =new JLabel("Contact No");
		jl[8]=new JLabel("City");
		b=new JButton("Add Student");
		for(int i=0;i<8;i++)
		    jt[i]=new JTextField();
		jl[0].setBounds(150,20,100,30);
		jl[1].setBounds(50,70,100,30);
		jt[0].setBounds(130,70,180,30);
		jl[2].setBounds(50,120,100,30);
		jt[1].setBounds(130,120,180,30);
		jl[3].setBounds(50,170,100,30);
		jt[2].setBounds(130,170,180,30);
		jl[4].setBounds(50,220,100,30);
		jt[3].setBounds(130,220,180,30);
		jl[5].setBounds(50,270,100,30);
		jt[4].setBounds(130,270,180,30);
		jl[6].setBounds(50,320,100,30);
		jt[5].setBounds(130,320,180,30);
		jl[7].setBounds(50,370,100,30);
		jl[8].setBounds(50,420,100,30);
		jt[6].setBounds(130,370,180,30);
		jt[7].setBounds(130,420,180,30);
		b.setBounds(150,500,150,30);
		add(b);
		for(int i=0;i<9;i++)
		{
			add(jl[i]);
		}
		for(int i=0;i<8;i++)
		{
			add(jt[i]);
		}
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String name=jt[0].getText();String email=jt[1].getText();String corse=jt[2].getText();String contact_no=jt[6].getText();
				String city=jt[7].getText();int fees=Integer.parseInt(jt[3].getText());int paid=Integer.parseInt(jt[4].getText());int due=Integer.parseInt(jt[5].getText());
				Student s=new Student(name,email,corse,contact_no,city,fees,paid,due);
				try{
				int status=StudentDatabase.save(s);
				if(status>0)
				{
					JOptionPane.showMessageDialog(AddStudent.this,"record succesfully inserted");
				}
				else
				{
					JOptionPane.showMessageDialog(AddStudent.this,"record not inserted");
					for(int i=0;i<8;i++)
					jt[i].setText("");
				}
				}
				catch(Exception q)
				{
					System.out.println(q);
				}
		}
		});
	}
	public static void main(String[]args)
	{
		new AddStudent("");
	}
}