package com.guiapps;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

 
	
public class GUIAPP2 extends Frame{
	Button b1,b2;
	TextField t;
	public GUIAPP2() {
		add(b1=new Button ("Click"));
		add(t=new TextField(15));
		add(b2=new Button("Clear"));
		b1.addActionListener((e)->t.setText("Hello World"));
        b2.addActionListener((e)->t.setText(""));
        addWindowListener(new WindowAdapter() {
        	
        	public void windowClosing(WindowEvent e) {
        		System.exit(0);
        	}
        });
        setSize(400,500);
        setVisible(true);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new GUIAPP2();

	}

}
