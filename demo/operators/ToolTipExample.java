package demo.operators;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ToolTipExample {
	public static void main(String args[]) {
		JButton b;
		JFrame f=new JFrame("Password Field Example");
		JPasswordField value=new JPasswordField();
		value.setBounds(100, 100, 100, 30);
		value.setToolTipText("enter your password");
		JLabel l1=new JLabel("Password");
		l1.setBounds(20, 100, 80, 30);
		JButton b1=new JButton("Enter");
		f.add(value);
		f.add(l1);
		f.add(b1);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
	}

}
