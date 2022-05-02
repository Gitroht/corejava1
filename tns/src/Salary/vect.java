package Salary;

import java.util.Vector;

import iddemo.Empl;

public class vect {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1= new Vector();
		Vector v2=new Vector();
		String s1= new String("Rohit");
		String s2=new String("Rohit");
		salr e1= new salr(1,"Rohit", 100000);
		salr e2= new salr(1,"Raha", 10000);
		v1.add(s1);
		v2.add(e1);
		System.out.println(v1.contains(s2));
		System.out.println(v2.contains(e2));

			}

		

	

	}


