package demo.operators;

import javax.swing.*;
import java.awt.event.*;

public class ButtonExample {
	public static void main(String args[]) {
		JFrame f=new JFrame("Button Example");
		final JTextField tf=new JTextField();
		tf.setBounds(50, 50, 150, 20);
		JButton b=new JButton("Click here");
		b.setBounds(50, 100, 95, 30);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				tf.setText("welcome to javatpoint");
			}
			
		});
		f.add(b);
		f.add(tf);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	
	/*ButtonExample(){
		JFrame f=new JFrame("Button Example");
		JButton b=new JButton(new ImageIcon("D:\\icon.png"));
		b.setBounds(100, 100, 100, 40);
		f.add(b);
		f.setSize(300,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
	}
	public static void main(String args[]) {
		new ButtonExample();
		
	}*/
	}


