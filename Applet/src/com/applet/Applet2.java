package com.applet;
import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;


public class Applet2 extends Applet{
	Button b1,b2;
	TextField t;
	public void init()
	{
		b1=new Button("click");
		t=new TextField(5);
		b2=new Button("clear");
		add(b1);
		add(t);
		add(b2);
	}

}
