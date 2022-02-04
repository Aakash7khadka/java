import javax.swing.*;


public class Question27
{
	public static void main(String args[])
	{
		try{
			JFrame frame=new JFrame();
		
		JLabel lb=new JLabel("Enter a number:");
		
		JTextField tf=new JTextField();
		JButton jb=new JButton("Square it");
		JLabel lb1=new JLabel("Result");
		JLabel lb2=new JLabel();
		tf.setBounds(150,50,100,50);
		jb.setBounds(50,100,80,50);
		lb.setBounds(50,50,100,50);
		lb1.setBounds(50,200,100,50);
		lb2.setBounds(150,200,100,50);
		frame.add(tf);
		frame.add(jb);
		frame.add(lb);
		frame.add(lb1);
		frame.add(lb2);
		frame.setSize(1000,500);
		
		jb.addActionListener(e->{
			lb2.setText(Math.pow(Integer.parseInt(tf.getText()),2)+"");
			});
		
		frame.setLayout(null);
		
		frame.setVisible(true);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}