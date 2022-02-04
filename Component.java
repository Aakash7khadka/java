import javax.swing.*;

public class Component extends JFrame
{
	Jlabel l;
	public Component()
	{
		setSize(500,500);
		l=JLabel("Holas");
		add(l);
		setBounds(0,0,100,50);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new Component();
	}
}