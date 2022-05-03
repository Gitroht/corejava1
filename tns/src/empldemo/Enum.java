package empldemo;

import java.util.Enumeration;
import java.util.Vector;

public class Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vec = new Vector();
		vec.addElement(1);
		vec.addElement(2);
		vec.addElement("Hello");
		vec.addElement(3);
		vec.addElement(4);
		vec.addElement("Rohit");
		vec.addElement(6);
		vec.addElement("Raha");
		vec.addElement(8);
		vec.addElement(9);
		vec.addElement(10);

		//System.out.println(vec);
		//System.out.println(vec.get(0));
		//System.out.println(vec.get(2));
Enumeration e= vec.elements();

while(e.hasMoreElements())
{
	System.out.println(e.nextElement());
}
	}

}
