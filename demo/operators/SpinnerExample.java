package demo.operators;

import javax.swing.*;
import java.awt.event.*;

public class SpinnerExample {
	public static void main(String args[]) {
		JFrame f=new JFrame("Spinner Example");
		SpinnerModel Value=new SpinnerNumberModel(5,0,10,1);
		JSpinner spinner=new JSpinner(Value);
		spinner.setBounds(100, 100, 50, 30);
		f.add(spinner);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	
		
	

}
}
