import java.sql.*;

public class Question30
{
	public static void main(String args[])
	{
		String Driver_url="com.mysql.cj.jdbc.Driver";
		String Connection_url="jdbc:mysql://localhost:3306/java";
		try{
			Class.forName(Driver_url);
			Connection con =DriverManager.getConnection(Connection_url,"root","");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from car");
			while(rs.next())
			{
				System.out.println(rs.getString("name"));
				System.out.println(rs.getInt("price"));
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}