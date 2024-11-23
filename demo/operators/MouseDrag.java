package demo.operators;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseDrag extends Applet implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void init() {
		addMouseMotionListener(this);
		setBackground(Color.blue);
	}
	public void mouseDragged1(MouseEvent me) {
		Graphics g=getGraphics();
		g.setColor(Color.pink);
		g.fillOval(me.getX(),me.getY(),5,5);
	}
	public void mouseMoved1(MouseEvent me) {}

}
