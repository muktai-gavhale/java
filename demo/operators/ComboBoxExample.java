package demo.operators;

import java.awt.event.*;
import javax.swing.*;

public class ComboBoxExample {
	ComboBoxExample(){
		JFrame f=new JFrame("Combo Box Example");
		/*String Country[]= {"India","U.S.A","America","China","South Africa"};
		JComboBox cb=new JComboBox(Country);
		cb.setBounds(50, 50, 90, 20);
		f.add(cb);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[]) {
		new ComboBoxExample();*/
		
		
		String name []= {"Ram","Megha","Srushti","Sakshi","Anisha","Mahesh","Kaivalya"};
		JComboBox cb=new JComboBox(name);
		cb.setBounds(40, 40, 80, 20);
		f.add(cb);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[]) {
		new ComboBoxExample();
	}

}
