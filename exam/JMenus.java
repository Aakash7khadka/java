import javax.swing.*;

public class JMenus extends JFrame
{
	JMenuBar mb;
	JMenu am,bm,cm;
	JCheckBoxMenuItem ct;
	JMenuItem at,bt;
	JPopupMenu pm;
	JMenus()
	{
		setSize(500,500);
		mb=new JMenuBar();
		am=new JMenu("File");
		am.setMnemonic('F');
		bm=new JMenu("Edit");
		cm=new JMenu("Mod");
		
		mb.add(am);
		mb.add(bm);
		mb.add(cm);
		
		at=new JMenuItem("Open",'O');
		bt=new JMenuItem("Edit with notepad",'E');
		ct=new JCheckBoxMenuItem("Status Bar",false);
		pm=new JPopupMenu("You cannot edit it");
		am.add(at);
		bm.add(bt);
		bm.add(cm);
		cm.add(ct);
		bm.add(pm);
		
		
		setJMenuBar(mb);
		setVisible(true);
		
	}
	public static void main(String args[])
	{
		new JMenus();
	}
}