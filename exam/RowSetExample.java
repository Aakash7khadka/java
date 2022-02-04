import javax.sql.rowset.*;

public class RowSetExample
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		JdbcRowSet rowset=RowSetProvider.newFactory().createJdbcRowSet();
		rowset.setUrl("jdbc:mysql://localhost/java");
		rowset.setUsername("root");
		rowset.setPassword("1234");
		rowset.setCommand("select * from car");
		rowset.execute();
		while(rowset.next())
		{
			System.out.println(rowset.getString(2));
			System.out.println(rowset.getString(3));
		}
	}
}