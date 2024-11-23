package demo.operators;

import javax.swing.*;
import java.awt.event.*;

public class MenuExample1 implements ActionListener {
     JFrame f;
     JMenuBar mb;
     JMenu file,edit,help;
     JMenuItem Cut,Copy,Paste,SelectAll;
     JTextArea ta;
     MenuExample1(){
    	 f=new JFrame();
    	 Cut=new JMenuItem("Cut");
    	 Copy=new JMenuItem("Copy");
    	 Paste=new JMenuItem("Paste");
    	 SelectAll=new JMenuItem("SelectAll");
    	 Cut.addActionListener(this);
    	 Copy.addActionListener(this);
    	 Paste.addActionListener(this);
    	 SelectAll.addActionListener(this);
    	 mb=new JMenuBar();
    	 file=new JMenu("File");
    	 edit=new JMenu("Edit");
    	 help=new JMenu("Help");
    	 edit.add(Cut);
    	 edit.add(Copy);
    	 edit.add(Paste);
    	 edit.add(SelectAll);
    	 mb.add(file);
    	 mb.add(edit);
    	 mb.add(help);
    	 ta=new JTextArea();
    	 ta.setBounds(5, 5, 360, 320);
    	 f.setSize(400, 400);
    	 f.add(mb);
    	 f.add(ta);
    	 f.setJMenuBar(mb);
    	 f.setLayout(null);
    	 f.setVisible(true);
    	 
     }
     public void actionPerformed(ActionEvent e) {
    	 if(e.getSource()==Cut);
    	 ta.cut();
    	 if(e.getSource()==Copy);
    	 ta.copy();
    	 if(e.getSource()==Paste);
    	 ta.paste();
    	 if(e.getSource()==SelectAll);
    	 ta.selectAll();
    	 
     }
     public static void main(String args[]) {
    	 new MenuExample1();
     }
}
