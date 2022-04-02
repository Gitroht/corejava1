package com.applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;

public class Applet5 extends Applet{
Button b;
TextField t;
public void init() {
	b=new Button();
	t=new TextField();
	b.setLabel("submit");
	add(b);
	add(t);
}
}
