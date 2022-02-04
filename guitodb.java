import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
public class guitodb{
	static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	static final String JDBC_DB_URL="jdbc:mysql://localhost:3306/java";
	
	static final String JDBC_USER="root";
	static final String JDBC_PASS="";
	public static void main(String args[]){
		JFrame f=new JFrame("Insert into db");
		JTextField j1=new JTextField();
		JTextField j2=new JTextField();
		JButton b1=new JButton("Submit");
		j1.setBounds(50,50,150,20);
		j2.setBounds(50,150,150,20);
		b1.setBounds(50,100,100,30);
		f.add(j1);f.add(j2);f.add(b1);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e){
				//Integer val=Integer.parseInt(j1.getText());
		String insertQuery="Insert into Person values('"+1+"','"+j1.getText()+"')";
		System.out.println(insertQuery);
		try{
			Class.forName(JDBC_DRIVER);
			Connection con=DriverManager.getConnection(JDBC_DB_URL,JDBC_USER,JDBC_PASS);
			Statement statement=con.createStatement();
			statement.executeUpdate(insertQuery);
			con.close();
		}
		catch(Exception sqlException){
			sqlException.printStackTrace();
		}
		}
		});
		
		
	}
}
