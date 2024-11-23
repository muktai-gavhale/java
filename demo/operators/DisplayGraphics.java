package demo.operators;

import java.awt.Graphics;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DisplayGraphics extends Canvas {
	public void paint(Graphics g) {
		g.drawString("Shapes", 40, 40);
		setBackground(Color.white);
		g.fillRect(130,30,100,80);
		g.fillOval(30,130,50,60);
		setForeground(Color.red);
		g.fillOval(130,130,50,60);
		g.drawArc(30,200,40,50,90,60);
		g.fillArc(30,130,40,50,180,40);
		
		
		
	}
	public static void main(String args[]) {
		DisplayGraphics m=new DisplayGraphics();
		JFrame f=new JFrame();
		f.add(m);
		f.setSize(400,400);
		//f.setLayout(null);
		f.setVisible(true);
	}

}
