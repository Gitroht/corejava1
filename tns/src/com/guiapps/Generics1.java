package com.guiapps;
import java.util.*;
public class Generics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>list= new ArrayList<String>();
list.add("Rohit");
list.add("Raha");

String s=list.get(1);
System.out.println("element is : +s");

Iterator<String> itr=list.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}
	}

}
