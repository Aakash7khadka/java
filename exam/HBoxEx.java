import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.Pos;

public class HBoxEx extends Application
{
	public void start(Stage primaryStage)
	{
		Button b1=new Button("Button 1");
		Button b2=new Button("Button 2");
		Button b3=new Button("Button 3");
		Button b4=new Button("Button 4");
		Button b5=new Button("Button 5");
		TextField t=new TextField();
		VBox root=new VBox(10,b1,b2,b3,b4,b5,t);
		
		
		root.setAlignment(Pos.BASELINE_CENTER);
		//root.getChildren().add(b1);
		//root.getChildren().add(b2);
		//root.getChildren().add(b3);
		//root.getChildren().add(b4);
		//root.getChildren().add(b5);
		
		Scene scene =new Scene(root,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	public static void main(String args[])
	{
		launch(args);
	}
}