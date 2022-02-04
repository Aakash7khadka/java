import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.ResultSet;  
import java.sql.Statement;  
import javax.sql.RowSetEvent;  
import javax.sql.RowSetListener;  
import javax.sql.rowset.JdbcRowSet;  
import javax.sql.rowset.RowSetProvider;  
  
public class RowSetEX{  
        public static void main(String[] args) throws Exception {  
                 Class.forName("com.mysql.cj.jdbc.Driver");  
      
    //Creating and Executing RowSet  
        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();  
        rowSet.setUrl("jdbc:mysql://localhost/java");  
        rowSet.setUsername("root");  
        rowSet.setPassword("1234");  
                   
        rowSet.setCommand("select * from car");  
        rowSet.execute();  
                   
    while (rowSet.next()) {  
                        // Generating cursor Moved event  
                        System.out.println("Id: " + rowSet.getString(1));  
                        System.out.println("Name: " + rowSet.getString(2));  
                        System.out.println("Price: " + rowSet.getString(3));  
                }  
                 
        }  
}  