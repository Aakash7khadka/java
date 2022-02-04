import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyAction1 extends JFrame implements KeyListener
{
	JTextField t1,t2,t3;
	JButton b1;
	
	public KeyAction1()
	{
		setSize(500,500);
		setLayout(new GridLayout(0,1));
		t1=new JTextField("1st number:");
		t2=new JTextField("2nd number:");
		b1=new JButton("Submit");
		t3=new JTextField("Press any key");
		b1.addKeyListener(this);
		add(t1);
		add(t2);
		add(t3);
		add(b1);
		setVisible(true);
	}
	
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyChar()=='a')
		{
			int sum=Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText());
			t3.setText("Sum:"+sum);
		}
		else if(e.getKeyChar()=='s')
		{
			int diff=Integer.parseInt(t1.getText())+Integer.parseInt(t2.getText());
			t3.setText("Difference:"+diff);
		}
		else
		{
			t3.setText("Press s for add and s for subtract");
		}
	}
	public void keyTyped(KeyEvent e)
	{}
	public void  keyReleased(KeyEvent e)
	{}
	public static void main(String args[])
	{
		new KeyAction1();
	}
}