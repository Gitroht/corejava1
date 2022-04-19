package com.thread;

public class Threaddemo3 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t= new Thread(new Threaddemo3());
t.start();
System.out.println(t.getName());

	}
public void run() {
	System.out.println("Rohit");
}
}
