package com.thread;

public class Threaddemo7 extends Thread{
	public void run()
	{
		System.out.println("\n"+" Thread Name is:"+ Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Threaddemo7 m= new Threaddemo7();
m.start();
	}

}
