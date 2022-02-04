import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
 class Key implements KeyListener{
    JFrame f=new JFrame("Key Pressed");
    JLabel l1=new JLabel("Reslut Here");
    JButton b1=new JButton("Button");
    public Key(){
        b1.setBounds(100,100,100,50);
        l1.setBounds(200,100,100,50);
        f.add(l1);
        f.add(b1);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
        b1.addKeyListener(this);
    }
    public void keyPressed(KeyEvent ke){
       if(ke.getKeyChar()=='a'){
            l1.setText("Pressed");
       }
  
    }

    public void keyTyped(KeyEvent ke) {
           
    }
    public void keyReleased(KeyEvent ke) {
           
    }

    
}


public class KeyPressEvent{
    public static void main(String[] args) {

      Key k=new Key();
        
    }
   
}