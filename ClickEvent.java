import javax.swing.*;
import java.awt.event.*;
public class ClickEvent extends JFrame implements ActionListener
{
	JLabel lb;
	ClickEvent()
	{
		lb=new JLabel("Before Click");
		lb.setBounds(60,50,170,20);
		setLayout(null);
		JButton b=new JButton("click me");
		b.setBounds(100,120,80,20);
		b.addActionListener(this);
		add(b);
		add(lb);
		setSize(300,300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		lb.setText("After click");
	}
	public static void main(String args[])
	{
		new ClickEvent();
	}
}