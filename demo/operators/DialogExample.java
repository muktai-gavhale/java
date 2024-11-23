package demo.operators;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class DialogExample {
	private static JDialog d;
	DialogExample(){
		JFrame f=new JFrame();
		d=new JDialog(f,"Dialog Example",true);
		d.setLayout(new FlowLayout());
		JButton b=new JButton("OK");
		b.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				DialogExample.d.setVisible(false);
			}
		});
		d.add(new JLabel("Click Button To Continue"));
		d.add(b);
		d.setSize(400, 400);
		d.setVisible(true);
		
		
	}
	public static void main(String args[]) {
		new DialogExample();
		
	}

}
