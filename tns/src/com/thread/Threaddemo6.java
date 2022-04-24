package com.thread;

public class Threaddemo6 extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread");
		}
	}
}
class Mainthread

{
	
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
Threaddemo6 t= new Threaddemo6();
t.start();
for( int i=0; i<5;i++)
{
	System.out.println("Parent Thread");
}
	}

}
