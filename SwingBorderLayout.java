import java.awt.*;
import javax.swing.*;

public class SwingBorderLayout extends Frame
{
	
		JButton b1,b2,b3,b4,b5,b6;
		public SwingBorderLayout()
		{
			setSize(500,500);
			setLayout(new BorderLayout());
			b1=new JButton("button 1");
			b2=new JButton("button 2");
			b3=new JButton("button 3");
			b4=new JButton("button 4");
			b5=new JButton("button 5");
		
			
			add(b1,BorderLayout.EAST);
			add(b2,BorderLayout.WEST);
			add(b3,BorderLayout.NORTH);
			add(b4,BorderLayout.SOUTH);
			add(b5,BorderLayout.CENTER);
			setVisible(true);
		}
		public static void main(String args[])
		{
			new SwingBorderLayout();
		}
	
}