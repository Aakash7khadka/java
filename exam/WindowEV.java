import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class WindowEV extends WindowAdapter
{
	JFrame f;
	WindowEV()
	{
		f=new JFrame();
		f.setSize(500,500);
		f.setLayout(new FlowLayout());
		f.addWindowListener(this);
		f.setVisible(true);
	}
	public void windowClosing(WindowEvent e)
	{
		JOptionPane.showMessageDialog(f,"bye bye");
	}
	public void windowOpened(WindowEvent e)
	{
		JOptionPane.showMessageDialog(f,"Wadacome");
	}
	public static void main(String args[])
	{
		new WindowEV();
	}
	
}