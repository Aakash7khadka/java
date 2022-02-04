import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ModelQ extends JFrame implements KeyListener
{
	JTextField t1,t2;
	JButton j1,j2;
	JLabel l1,l2;
	String Driver_url="com.mysql.cj.jdbc.Driver";
	String con_url="jdbc:mysql://localhost/java";
	Connection con;
	PreparedStatement st;
	ModelQ()
	{
		try{
			Class.forName(Driver_url);
			con=DriverManager.getConnection(con_url,"root","1234");
			st=con.prepareStatement("select * from user where uid=? and password=?");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		setSize(500,500);
		setTitle("Login Form");
		setLayout(new GridLayout(10,2));
		t1=new JTextField();
		t2=new JTextField();
		j1=new JButton("ok");
		j2=new JButton("cancel");
		l1=new JLabel("User Id");
		l2=new JLabel("Password");
		
		j1.addKeyListener(this);
		j2.addKeyListener(this);
		add(l1);
		add(t1);add(l2);add(t2);add(j1);add(j2);
		setVisible(true);
		
	}
	
	public void keyPressed(KeyEvent e)
	{
		
		if(e.getKeyChar()=='l')
		{
			try
			{
				int uid=Integer.parseInt(t1.getText());
				String password=t2.getText();
				st.setInt(1,uid);
				st.setString(2,password);
				ResultSet rs=st.executeQuery();
				System.out.println(rs.getRow());
				if(rs.next())
				{
					JOptionPane.showMessageDialog(this,"logged in");
				}
				
				else
					{
						JOptionPane.showMessageDialog(this,"invalid credentials");
						t1.requestFocus();
					}
			}
			catch(ClassNotFoundException c)
			{
				System.out.println("Invalid class");
			}
			catch(Exception ee)
			{
				System.out.println(ee);
			}
			
		}
		if(e.getKeyChar()=='c')
		{
			t1.setText("");
			t2.setText("");
			t1.requestFocus();
		}
	}
	
	public void keyTyped(KeyEvent e)
	{}
	
	public void keyReleased(KeyEvent e)
	{}
	public static void main(String args[])
	{
		new ModelQ();
	}
}