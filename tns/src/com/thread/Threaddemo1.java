package com.thread;

public class Threaddemo1 extends Thread{
public void run() {
	System.out.println("My Thread");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Threaddemo1 th= new Threaddemo1();
th.start();
th.getName();

	}

}
