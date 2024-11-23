package demo.operators;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame.*;
    
public class MyCanvas extends Canvas  {
	public void paint(Graphics g) {
		Toolkit t=Toolkit.getDefaultToolkit();
		Image i=t.getImage("p3gif");
		g.drawImage(i,120,130,this);
		
	}
	public static void main(String args[]) {
		MyCanvas m=new MyCanvas();
		JFrame f=new JFrame();
		f.add(m);
		f.setSize(400,400);
		f.setVisible(true);
	}

}
