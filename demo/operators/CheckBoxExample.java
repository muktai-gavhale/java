package demo.operators;

import java.awt.event.*;
import javax.swing.*;

public class CheckBoxExample {
	CheckBoxExample(){
		JFrame f=new JFrame("Check Box Examples");
		JCheckBox checkBox1=new JCheckBox("c++");
		checkBox1.setBounds(100, 100, 50, 50);
		JCheckBox checkBox2=new JCheckBox("java",true);
		checkBox2.setBounds(100, 150, 50, 50);
		JCheckBox checkBox3=new JCheckBox("css");
		checkBox3.setBounds(100, 200, 50, 50);
		f.add(checkBox1);
		f.add(checkBox2);
		f.add(checkBox3);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	public static void main(String args[]) {
		new CheckBoxExample();
	}

}
