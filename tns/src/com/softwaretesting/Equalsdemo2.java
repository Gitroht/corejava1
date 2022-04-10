package com.softwaretesting;

public class Equalsdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1=new String("Rohit");
String s2=new String("Rohit");
System.out.println("s1 and s2 are equal:"+(s1==s2));
System.out.println("s1 and s2 are equal:"+(s1.equals(s2)));
s1=s2;
System.out.println("s1 and s2 are equal:"+(s1==s2));
	}

}
