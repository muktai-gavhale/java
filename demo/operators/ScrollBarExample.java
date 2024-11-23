package demo.operators; 

import java.awt.event.*;
import javax.swing.*;

public class ScrollBarExample {
	ScrollBarExample(){
		JFrame f=new JFrame("Scroll Bar Example");
		JScrollBar sb=new JScrollBar();
		sb.setBounds(100, 100, 50, 100);
		f.add(sb);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[]) {
		new ScrollBarExample();
	}
}
		
		/*final JLabel label=new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(400,100);
		final JScrollBar s=new JScrollBar();
		s.setBounds(100, 100, 50, 100);
		f.add(s);
		f.add(label);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		s.addAdjustmentListener(new AdjustmentListener() {
			public void AdjustmentValueChanged(AdjustmentEvent e) {
				label.setText("Vertical Scrollbar value is:"+s.getValue());
			}
			});
			
		
			
		
	}
	public static void main(String args[]) {
		new ScrollBarExample(); 
	}*/

	


