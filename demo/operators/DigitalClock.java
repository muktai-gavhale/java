package demo.operators;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DigitalClock extends Applet implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	Thread t=null;
	int hours=0,minutes=0,seconds=0;
	String timeString=" ";
	
	public void init() {
		setBackground(Color.green);
	}
	public void start() {
		t=new Thread(this);
		t.start();
	}
	public void run1(Object Calender) {
		try {
			while(true) {
				Calendar cal=((Calendar) Calender).getInstance();
				hours=cal.get(Calendar.HOUR_OF_DAY);
				if(hours>12)hours=12;
				
				minutes=cal.get(Calendar.MINUTE);
				seconds=cal.get(Calendar.SECOND);
				
				SimpleDateFormat Formatter=new SimpleDateFormat("hh:mm:ss");
				Date date=cal.getTime();
				timeString=Formatter.format(date);
				repaint();
				t.sleep(1000);
				
			}
		}catch (Exception e) {}
		
	}
	public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.drawString(timeString,50,50);
	}

}
