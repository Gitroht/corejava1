class A{
	public void m1() {
		System.out.println("Hello Everyone!!!");
		
	}
}
class B extends A{
	public void m2() {
		System.out.println("Welcome to C2TC Training");
	}

public void m1() {
	System.out.println("Day 2");
}
public void m1(String s) {
	System.out.println(s);
}
}
public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     A a,a1;
     B b;
     //a= new A();
     a= new A();
     //a1= new A();//instantiating the object
     b=new B();
     a1=a;
     a1.m1();//Hello Everyone
     a1=b;
     a1.m1();//Day 2
     a1.m2();
     
     
	}

}
