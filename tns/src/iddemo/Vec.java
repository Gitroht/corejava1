package iddemo;

import java.util.Vector;



public class Vec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1= new Vector();
		Vector v2=new Vector();
		String s1= new String("Rohit");
		String s2=new String("Rohit");
		Empl e1= new Empl(1,"Rohit", 10000);
		Empl e2= new Empl(1,"Raha", 10000);
		v1.add(s1);
		v2.add(e1);
		System.out.println(v1.contains(s2));
		System.out.println(v2.contains(e2));

			}

		

	}


