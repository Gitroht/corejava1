package com.applet;


class Aa{
	
}
class Ab{
int i;
String s;
public Ab(int i, String s) {
	this.i=i;
	this.s=s;
	}
}


public class EqualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Aa a=new Aa();
Aa a1=a;
Aa a2=new Aa();
if(a==a1)
	System.out.println("Equal");
else
	System.out.println("Not Equal");
if(a==a2)
	System.out.println("Equal");
else
	System.out.println("Not Equal");

Ab b= new Ab(10,"Rohit");
Ab b1=b;
Ab b2= new Ab(10,"Rohit");
if(b==b1)
	System.out.println("Equal");
else
	System.out.println("Not Equal");
if(b==b2)
	System.out.println("Equal");
else
	System.out.println("Not Equal");

	}

}
