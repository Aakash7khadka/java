import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ItemEV extends JFrame implements ItemListener
{
	JCheckBox c1,c2;
	ButtonGroup bg;
	JComboBox jc;
	String countries[]={"Nep","Ind","chi"};
	ItemEV()
	{
		setSize(500,500);
		setLayout(new GridLayout(0,1));
		c1=new JCheckBox("Male");
		c2=new JCheckBox("Female");
		bg=new ButtonGroup();
		jc=new JComboBox(countries);
		bg.add(c1);
		bg.add(c2);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		jc.addItemListener(this);
		add(c1);
		add(c2);
		add(jc);
		
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource()==c1 && c1.isSelected())
		{
			JOptionPane.showMessageDialog(this,"You are male");
		}
		else if(e.getSource()==c2 && c2.isSelected())
		{
			JOptionPane.showMessageDialog(this,"You are female");
		}
		else if(e.getSource()== jc && e.getStateChange()==e.SELECTED)
		{
			JOptionPane.showMessageDialog(this,"Your country is:"+jc.getSelectedItem());
		}
	}
	public static void main(String args[])
	{
		new ItemEV();
	}
}