package demo.operators;

import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;

public class ListExample {
	public static void main(String args[]) {
		new ListExample();
	}

	
	ListExample(){
		JFrame f=new JFrame();
		DefaultListModel<String>l1=new DefaultListModel<>();
		l1.addElement("Item 1");
		l1.addElement("Item 2");
		l1.addElement("Item 3");
		l1.addElement("Item 4");
		l1.addElement("Item 5");
		JList<String>list=new JList<>(l1);
		f.add(list);
		f.setBounds(100, 100, 75, 75);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
		
}
