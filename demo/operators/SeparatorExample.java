package demo.operators;

import javax.swing.*;
import java.awt.event.*;

public class SeparatorExample {
	JMenu menu,submenu;
	JMenuItem i1,i2,i3,i4,i5;
	SeparatorExample(){
		JFrame f=new JFrame("Separator Example");
		JMenuBar mb=new JMenuBar();
		menu=new JMenu("Menu");
		i1=new JMenuItem("Item1");
		i2=new JMenuItem("Item2");
		i3=new JMenuItem("Item3");
		menu.add(i1);
		menu.addSeparator();
		menu.add(i2);
		menu.addSeparator();
		menu.add(i3);
		mb.add(menu);
		f.setJMenuBar(mb);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[]) {
		new SeparatorExample();
	}

}
