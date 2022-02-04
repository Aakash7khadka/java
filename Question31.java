import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Question31 implements ActionListener
{
	JFrame f;
	JLabel jl1,jl2;
	JTextField tf;
	JButton jb1,jb2,jb3;
	String rev="";
	String vowels="";
	public Question31()
	{
		//super("JDBC with Swing");
		f=new JFrame();
		jl1=new JLabel("Enter a string:");
		tf=new JTextField();
		jb1=new JButton("Reverse");
		 jb2=new JButton("Pallindrome");
		 jb3=new JButton("Vowels");
		jl2=new JLabel("Result:");
		
		jl1.setBounds(50,50,100,50);
		tf.setBounds(170,50,100,50);
		jb1.setBounds(50,100,100,50);
		jb2.setBounds(50,150,100,50);
		jb3.setBounds(50,200,100,50);
		jl2.setBounds(50,250,500,50);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		
		f.add(jl1);
		f.add(tf);
		f.add(jb1);
		f.add(jb2);
		f.add(jb3);
		f.add(jl2);
		
		f.setSize(1000,700);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		String _input=tf.getText();
		if(e.getActionCommand()=="Reverse")
		{
			for(int i=0;i<_input.length();i++)
			{
				char ch=_input.charAt(i);
				rev=ch+rev;
			}
			jl2.setText("Reverse: "+rev);
		}
		else if(e.getActionCommand()=="Pallindrome")
		{
			if(_input.compareTo(rev)==0)
			{
				jl2.setText("pallindrome");
			}
			else
			{
				jl2.setText("not pallindrome");
			}
			
		}
		else
		{
			for(int i=0;i<_input.length();i++)
			{
				char ch=_input.charAt(i);
				if(ch=='a' || ch== 'e'||ch=='i'||ch=='o'||ch=='u')
				{
					vowels= vowels+ ch +" "; 
				}
			}
			jl2.setText("Vowels:"+vowels);
		}
		
	}
	public static void main(String args[])
	{
		
		
		new Question31();
		
		
	}
}