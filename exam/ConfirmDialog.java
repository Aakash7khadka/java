import javax.swing.*;

public class ConfirmDialog extends JFrame
{
	JDialog d;
	JTextField t;
	ConfirmDialog(){
		setSize(500,500);
		Object options[]={"Yep man","Nope dope"};
		JOptionPane.showConfirmDialog(this,"K xa ba?","Confirm",JOptionPane.OK_CANCEL_OPTION);
		JOptionPane.showMessageDialog(this,"K xa ba?","Confirm",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showInputDialog(this,"K xa ba?","Confirm");
		JOptionPane.showOptionDialog(this,"Choose gar","choice",JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE,null,options,options[0]);
		t=new JTextField();
		d=new JDialog(this,"Mod",true);
		d.setSize(200,200);
		d.add(t);
		d.setVisible(true);
		
		setVisible(true);
		
	}
	public static void main(String args[])
	{
		new ConfirmDialog();
	}
}