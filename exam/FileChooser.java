import javax.swing.*;

public class FileChooser extends JFrame
{
	JDialog d;
	JTextField t;
	JColorChooser cc;
	JFileChooser jf;
	FileChooser(){
		setSize(500,500);
		jf=new JFileChooser();
		add(jf);
		
		setVisible(true);
		
	}
	public static void main(String args[])
	{
		new FileChooser();
	}
}