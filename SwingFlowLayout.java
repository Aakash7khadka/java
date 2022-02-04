import java.awt.*;
import javax.swing.*;

public class SwingFlowLayout extends Frame
{
	
		JButton b1,b2,b3,b4,b5,b6;
		public SwingFlowLayout()
		{
			setSize(500,500);
			setLayout(new FlowLayout(FlowLayout.LEFT));
			b1=new JButton("button 1");
			b2=new JButton("button 2");
			b3=new JButton("button 3");
			b4=new JButton("button 4");
			b5=new JButton("button 5");
			b6=new JButton("button 6");
			
			add(b1);
			add(b2);
			add(b3);
			add(b4);
			add(b5);
			add(b6);
			setVisible(true);
		}
		public static void main(String args[])
		{
			new SwingFlowLayout();
		}
	
}