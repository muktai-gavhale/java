package demo.operators;

import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;

public class TextAreaExample {
	TextAreaExample(){
		JFrame f=new JFrame("Text Area Example");
		JTextArea area=new JTextArea("Welcome To Javatpoint");
		area.setBounds(30, 30, 200, 200);
		f.add(area);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[]) {
		new TextAreaExample();
	}

}
