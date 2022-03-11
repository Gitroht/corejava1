package Day3;
class Doctor{
	float salary=70000;
	
}
class Surgeon extends Doctor{
	float bonus=30000;
	
}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Surgeon s=new Surgeon();
System.out.println("salary of Doctor"  +s.salary);
System.out.println("bonus of surgeon"  +s.bonus);

	}

}
