import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.Orientation;
public class Border extends Application{

   public void start(Stage ps){
    Button b1=new Button("Button 1");
    Button b2=new Button("Button 2");
    Button b3=new Button("Button 3");
    Button b4=new Button("Button 4");
    Button b5=new Button("Button 1");
    Button b6=new Button("Button 1");
	Label l=new Label("No thing");
	TextField t=new TextField();
    GridPane root=new GridPane();
	root.setHgap(5);
	root.setVgap(5);
    root.addRow(0,b1);
	root.addRow(0,b2);
	root.addRow(1,b3);
	b1.setOnAction(e->{
		l.setText("action Performed");
	});
	root.addRow(5,l);
	root.addRow(5,t);

    Scene scene=new Scene(root,500,500);
    ps.setScene(scene);
    ps.show();


   }
public static void main(String[] args) {
    launch(args);
}
   
}