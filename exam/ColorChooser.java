import javax.swing.*;

public class ColorChooser extends JFrame
{
	JDialog d;
	JTextField t;
	JColorChooser cc;
	ColorChooser(){
		setSize(500,500);
		cc=new JColorChooser();
		add(cc);
		
		setVisible(true);
		
	}
	public static void main(String args[])
	{
		new ColorChooser();
	}
}