import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.Orientation;
public class BorderPaneEx extends Application{

   public void start(Stage ps){
    Button b1=new Button("Button 1");
    Button b2=new Button("Button 1");
    Button b3=new Button("Button 1");
    Button b4=new Button("Button 1");
    Button b5=new Button("Button 1");
    Button b6=new Button("Button 1");

    BorderPane bp=new BorderPane();
    bp.setTop(b1);
    bp.setBottom(b2);
    bp.setLeft(b3);
    bp.setRight(b4);
    bp.setCenter(b5);

    Scene scene=new Scene(bp);
    ps.setScene(scene);
    ps.show();


   }
public static void main(String[] args) {
    launch(args);
}
   
}