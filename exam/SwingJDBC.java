import javax.swing.*;
import java.sql.*;
//import javax.swing.layout.*;
import java.awt.*;
import java.awt.event.*;

public class SwingJDBC extends JFrame implements ActionListener
{
	JTextField name,price;
	JButton insert;
	JLabel namel,pricel;
	SwingJDBC()
	{
		setSize(500,500);
		setLayout(new GridLayout(10,2));
		namel=new JLabel("Name:");
		pricel=new JLabel("Price:");
		name=new JTextField();
		price=new JTextField();
		insert=new JButton("Insert");
		add(namel);
		add(name);
		add(pricel);
		add(price);
		add(insert);
		insert.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String args[]){
		new SwingJDBC();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/java","root","1234");
		PreparedStatement pst=con.prepareStatement("Insert into car(name,price) values (?,?)");
		String _name=name.getText();
		String _price=price.getText();
		pst.setString(1,_name);
		pst.setString(2,_price);
		System.out.println(pst.executeUpdate());
		JOptionPane.showMessageDialog(this,"Sucessfully inserted","Car",JOptionPane.INFORMATION_MESSAGE);
		con.close();
		
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
	}
}