import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.Orientation;

public class FlowPaneEx extends Application
{
	public void start(Stage primaryStage) throws Exception
	{
		Button b1=new Button("Button 1");
		Button b2=new Button("Button 1");
		Button b3=new Button("Button 1");
		Button b4=new Button("Button 1");
		Button b5=new Button("Button 1");
		FlowPane root=new FlowPane(Orientation.VERTICAL,5,5);
		root.getChildren().add(b1);
		root.getChildren().add(b2);
		root.getChildren().add(b3);
		root.getChildren().add(b4);
		root.getChildren().add(b5);
		
		
		Scene scene =new Scene(root,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String args[])
	{
		launch(args);
	}
	
}