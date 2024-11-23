package demo.operators;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JTextField;

public class EventJApplet extends JApplet implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
			}
	JButton b;
	JTextField tf;
	
	public void init() {
		tf=new JTextField();
		tf.setBounds(30,40,150,20);
		
		b=new JButton("Click");
		b.setBounds(80,150,50,60);
		
		add(tf);
		add(b);
		addActionListener(this);
		
		setLayout(null);
	}

	private void addActionListener(EventJApplet eventJApplet) {
		// TODO Auto-generated method stub
		
	}
	public void actionPerformed1(ActionEvent e) {
		tf.setText("welcome");
	}


}
