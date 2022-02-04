import java.sql.*;
public class Question29
{
	static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	static final String JDBC_URL="jdbc:mysql://localhost:3306/java";
	static final String USERNAME="root";
	static final String PASSWORD="1234";
	
	public static void main(String args[])
	{
		try
		{
			Class.forName(JDBC_DRIVER);
			Connection con=DriverManager.getConnection(JDBC_URL,USERNAME,PASSWORD);
			Statement st=con.createStatement();
			st.executeUpdate("INSERT INTO CAR (NAME,PRICE) VALUES ('Mercedes',50000000);");
			con.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}