package demo.operators;

import javax.swing.*;
import java.awt.event.*;

public class PasswordFieldExample {
	public static void main(String args[]) {
		JFrame f=new JFrame("Password Field Example");
		
		/*JPasswordField value=new JPasswordField();
		JLabel l1=new JLabel("Password");
		l1.setBounds(20,100, 80, 30);
		value.setBounds(100,100,100,30);
		f.add(l1);
		f.add(value);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);*/
		
		final JLabel label=new JLabel();
		label.setBounds(20, 150, 200, 50);
		final JPasswordField value=new JPasswordField();
		//final JPasswordField value1=new JPasswordField();
		value.setBounds(100, 75, 100, 30);
		JLabel l1=new JLabel("Username");
		l1.setBounds(20, 20, 80, 30);
		JLabel l2=new JLabel("Password");
		l2.setBounds(20, 75, 80, 30);
		JButton b=new JButton("Login");
		b.setBounds(100, 120, 80, 30);
		final JTextField text=new JTextField();
		text.setBounds(100, 20, 100, 30);
		//final JTextField text1=new JTextField();
		//text1.setBounds(100, 20, 100, 30);
		f.add(l1);
		f.add(l2);
		f.add(text);
		f.add(b);
		f.add(value);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String data="Username:"+text.getText();
				 data+="Password:"+new String(value.getPassword());
				label.setText(data);
				
				}
			
		});
		
		
				
	}

}
