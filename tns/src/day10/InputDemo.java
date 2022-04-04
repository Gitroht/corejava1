package day10;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class ScannerDemo{
	public void addition() {
		int num1,num2,sum;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first number");
		num1=sc.nextInt();
		
		System.out.println("enter the second number");
		num2=sc.nextInt();
		
		sc.close();
		sum=num1+ num2;
		System.out.println("sum of these two numbers:"+sum);
		
		
	}
}
public class InputDemo {

	public static void main(String[] args) throws IOException  {
		
		
		// TODO Auto-generated method stub
		int a,b,s;
		InputStreamReader is= new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
		
System.out.println("Br- Enter First Number:");
a=Integer.parseInt(br.readLine());

System.out.println("Br- Enter Second  Number:");
b=Integer.parseInt(br.readLine());
s= a+b;
System.out.println("sum is" +s);


	}

}
