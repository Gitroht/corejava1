package com.guiapps;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;

public class GUIApp extends Frame {
	Button b1,b2;
	TextField t;
	public GUIApp() {
		add(b1=new Button ("Click"));
		add(t=new TextField(15));
		add(b2=new Button("Clear"));
		b1.addActionListener((e)->t.setText("Hello World"));
        b2.addActionListener((e)->t.setText(""));
        addWindowListener(new WindowAdapter() {
        	public void windowclosing() {
        		System.exit(0);
        		
        	}
        });
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
