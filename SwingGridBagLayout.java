import java.awt.*;
import javax.swing.*;

public class SwingGridBagLayout extends Frame
{
	
		JButton b1,b2,b3,b4,b5,b6;
		GridBagConstraints gbc=new GridBagConstraints();
		public SwingGridBagLayout()
		{
			setSize(1000,500);
			setLayout(new GridBagLayout());
			
			
			b1=new JButton("button 1");
			
			b2=new JButton("button 2");
			b3=new JButton("button 3");
			b4=new JButton("button 4");
			b5=new JButton("button 5");
		
			gbc.gridx=0;
			gbc.gridy=0;
			gbc.gridheight=5;
			gbc.fill=GridBagConstraints.VERTICAL;
			add(b1,gbc);
			gbc.gridx=1;
			gbc.gridy=1;
			gbc.gridheight=1;
			add(b2,gbc);
			gbc.gridx=2;
			gbc.gridy=2;
			add(b3,gbc);
			gbc.gridx=1;
			gbc.gridy=3;
			gbc.gridwidth=2;
			gbc.fill=GridBagConstraints.HORIZONTAL;
			add(b4,gbc);
			gbc.gridx=1;
			gbc.gridy=4;
			gbc.gridwidth=3;
			gbc.fill=GridBagConstraints.HORIZONTAL;
			add(b5,gbc);
			setVisible(true);
		}
		public static void main(String args[])
		{
			new SwingGridBagLayout();
		}
	
}