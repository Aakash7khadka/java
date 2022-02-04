import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import java.sql.*;


public class FX extends Application
{
	public void start(Stage primaryStage)
	{
		Label l1=new Label("Name");
		Label l2=new Label("Price");
		Label l3=new Label("");
		TextField t1=new TextField();
		TextField t2=new TextField();
		Button b1=new Button("Insert");
		
		FlowPane vb=new FlowPane(10,10,l1,t1,l2,t2,b1,l3);
		
		b1.setOnAction(e->{
			try
			{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/java","root","1234");
			PreparedStatement st=con.prepareStatement("Insert into car (name,price) values (?,?)");
			String val1=t1.getText();
			String val2=t2.getText();
			st.setString(1,val1);
			st.setString(2,val2);
			st.executeUpdate();
			
			l3.setText("Sucessfully inserted");
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		});
		
		
		Scene scene=new Scene(vb,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	public static void main(String args[])
	{
		launch(args);
	}
}