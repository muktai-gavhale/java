package demo.operators;

import java.awt.event.*;
import javax.swing.*;

public class RadioButtonExample extends JFrame implements ActionListener {
	
	/*RadioButtonExample(){
		JFrame f=new JFrame("Radio Button Example");
		JRadioButton r1=new JRadioButton("A) Male");
		JRadioButton r2=new JRadioButton("B) Female");
		r1.setBounds(75, 50, 100, 30);
		r2.setBounds(75, 100, 100, 30);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		f.add(r1);
		f.add(r2);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[]) {
		new RadioButtonExample();
	}*/
	
	
	JRadioButton rb1,rb2;
	JButton b;
	RadioButtonExample(){
		JFrame f=new JFrame("Radio Button Example");
		rb1=new JRadioButton("Male");
		rb1.setBounds(100,50,100,30);
		rb2=new JRadioButton("Female");
		rb2.setBounds(100,100,100,30);
		ButtonGroup bg=new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		b=new JButton("Click");
		b.setBounds(100,150,80,30);
		b.addActionListener(this);
		add(rb1);
		add(rb2);
		add(b);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		if(rb1.isSelected()) {
			JOptionPane.showMessageDialog(this,"you are male");
			
		} if(rb2.isSelected()) {
			JOptionPane.showMessageDialog(this,"you are female");
			
		}
		
		}
		public static void main(String args[]) {
			new RadioButtonExample();
	}

}
