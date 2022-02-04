import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class JavaFxExample extends Application{
	
	public static void main(String args[]){
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage)throws Exception{
		
		Label firstNumber =new Label("First Number");
		Label secondNumber =new Label("Second Number");
		Label result=new Label("Result");
		TextField tf1=new TextField();
		TextField tf2=new TextField();
		TextField tf3=new TextField();
		Button b=new Button("Submit");
		b.setOnAction(e->tf3.setText(((Integer.parseInt(tf1.getText()))+(Integer.parseInt(tf2.getText())))+""));
		GridPane root=new GridPane();
		root.addRow(0,firstNumber,tf1);
		root.addRow(1,secondNumber,tf2);
		root.addRow(2,b);
		root.addRow(3,result,tf3);
		Scene scene=new Scene(root,300,200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Add Numbers");
		primaryStage.show();
		
		
		
	}
	
}