package com.thread;

public class Threaddemo2 extends Thread{
public void run() {
	System.out.println("My Thread");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Threaddemo2 th= new Threaddemo2();
th.start();
System.out.println(th.getName());
	}

}
