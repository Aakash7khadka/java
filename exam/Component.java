import javax.swing.*;
import java.awt.*;
public class Component extends JFrame
{
	JLabel l;
	JTextField t;
	JPasswordField p;
	JTextArea ta;
	JCheckBox c;
	public Component()
	{
		setSize(500,500);
		setLayout(new GridLayout(0,2,5,5));
		l=new JLabel("Enter name");
		add(l);
		t=new JTextField(2);
		add(t);
		p=new JPasswordField();
		add(p);
		ta=new JTextArea();
		add(ta);
		c=new JCheckBox("Check if you are man",true);
		add(c);
		ButtonGroup bg=new ButtonGroup();
		JRadioButton j1,j2,j3;
		j1=new JRadioButton("Football");
		j2=new JRadioButton("Cricket");
		j3=new JRadioButton("Basketball");
		bg.add(j1);
		bg.add(j2);
		bg.add(j3);
		add(j1);
		add(j2);
		add(j3);
		JToggleButton j4=new JToggleButton("Press");
		add(j4);
		String names[]=new String[9];
		names[0]="aalu alu ali alu dfasffjljf asldfjasf salfjsd fasjf alsjdfsladf sadlfjadsf";
		names[1]="kauli";
		names[2]="vanta";
		names[3]="aalu";
		names[4]="kauli";
		names[5]="vanta";
		names[6]="aalu";
		names[7]="kauli";
		names[8]="vanta";
		JList jl=new JList(names);
		JScrollPane jsp=new JScrollPane(jl);
		add(jsp);
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);  
		slider.setPaintLabels(true); 
		slider.setMinorTickSpacing(2);  
slider.setMajorTickSpacing(10);  
slider.setPaintTicks(true);  
		add(slider);
		 
		setVisible(true);
	}
	public static void main(String args[])
	{
		new Component();
	}
}