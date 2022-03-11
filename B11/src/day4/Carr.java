package day4;
 
class car{
	public int gear,speed;
	boolean clutch, brake,accelerator;
	public void start()
	{
		
	}
	public void stop()
	{
		
	}
	
	public void setspeed(int i)
	{
		speed=i;
		
	}
	public int getspeed()
	
	{
		return speed;
	}
}



public class Carr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
car c1,c2;
c1=new car();
c2=new car();
c1.setspeed(300);
c2.setspeed(400);
System.out.println(c2.getspeed());

	
	}

}
