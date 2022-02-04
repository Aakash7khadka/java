import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseEV extends JFrame implements MouseListener
{
	JButton b;
	JLabel l;
	MouseEV()
	{
		setSize(500,500);
		setLayout(new FlowLayout());
		
		b=new JButton("Click");
		b.addMouseListener(this);
		b.setBackground(Color.red);
		l=new JLabel();
		add(l);
		add(b);
		setVisible(true);
	}
	
	public void mousePressed(MouseEvent e)
	{}
	public void mouseClicked(MouseEvent e)
	{}
	public void mouseReleased(MouseEvent e)
	{}
	public void mouseEntered(MouseEvent e)
	{
		l.setText("Entered");
		b.setBackground(Color.white);
	}
	public void mouseExited(MouseEvent e)
	{
		l.setText("Exited");
		b.setBackground(Color.red);
	}
	public static void main(String args[])
	{
		new MouseEV();
	}
}