package com.guiapps;
class Tcontent{
	public synchronized void m1(String s)
	{
		System.out.println("{");
		System.out.println(s);
		try {
			Thread.sleep(200);
			
		}
		catch(Exception e) {
		}
		System.out.println("}");
		
	}
}
class ThreadJob extends Thread{
	Tcontent t;
	String s;
	public ThreadJob(Tcontent t,String s) {
		this.t=t;
		this.s=s;
		start();
		
	}
	public void run() {
		t.m1(s);
		
	}
}
public class Sycdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Tcontent t= new Tcontent();
new ThreadJob(t,"Hello");
new ThreadJob(t,"World");

	}

}
