package demo.operators;

import javax.swing.*;
import java.awt.event.*;

public class OptionPane {
	JFrame f;
	OptionPane(){
		JFrame f=new JFrame();
		JOptionPane.showMessageDialog(f,"hello,welcome to javatpoint");
		
	}
	public static void main(String args[]) {
		new OptionPane();
	}

}
