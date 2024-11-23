package demo.operators;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PanelExample {
	PanelExample(){
		JFrame f=new JFrame("Panel Example");
		JPanel panel=new JPanel();
		panel.setBounds(40, 80, 200, 200);
		panel.setBackground(Color.BLUE);
		JButton b1=new JButton("Button b1");
		b1.setBounds(50, 100, 80, 30);
		b1.setBackground(Color.yellow);
		JButton b2=new JButton("Button b2");
		b2.setBounds(100, 100, 80, 30);
		b1.setBackground(Color.pink);
		panel.add(b1);
		panel.add(b2);
		f.add(panel);
		
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
		
		
		
	}
	public static void main(String args[]) {
		new PanelExample();
	}

}
