import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.Pos;

public class BorderPane extends Application
{
	public void start(Stage primaryStage)
	{
		BorderPane root=new BorderPane();
		Button b1=new Button("Button 1");
		Button b2=new Button("Button 2");
		Button b3=new Button("Button 3");
		Button b4=new Button("Button 4");
		Button b5=new Button("Button 5");
		
		root.setLeft(b1);
		root.setRight(b2);
		root.setBottom(b3);
		root.setTop(b4);
		root.setCenter(b5);
		
		Scene scene =new Scene(root,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	public static void main(String args[])
	{
		launch(args);
	}
}