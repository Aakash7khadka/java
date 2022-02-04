
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
public class Question37 extends Application
{
	public static void main(String args[])
	{
			launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Label l1=new Label("Enter Principle:");
		Label l2=new Label("Enter Time:");
		Label l3=new Label("Enter Rate:");
		TextField t1=new TextField();
		TextField t2=new TextField();
		TextField t3=new TextField();
		Label l4=new Label();
		Button b1=new Button("Calculate");
		b1.setOnAction(e->{
			double p=Double.parseDouble(t1.getText());
			double t=Double.parseDouble(t2.getText());
			double r=Double.parseDouble(t3.getText());
			double i=(p*t*r)/100;
			l4.setText("Simple Intrest:"+i);
			
		});
		GridPane root=new GridPane();
		root.addRow(0,l1,t1);
		root.addRow(1,l2,t2);
		root.addRow(2,l3,t3);
		root.addRow(3,b1);
		root.addRow(4,l4);
		Scene scene=new Scene(root,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}