package demo.operators;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class DisplayImages extends Applet{
	//private static final String Image = null;
	Image picture;
	public void init() {
		picture=getImage(getDocumentBase(),"Sonoo.jpg");
		
	}
	public void paint(Graphics g) {
		g.drawImage(picture,30,30,this); 
	}
}
