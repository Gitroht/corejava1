package day6;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123;
		int temp=n;
		int rev=0,rem;
		while(temp !=0)
			
		{
			rem=temp%10;
			rev=(rev*10)+rem;
			temp=temp/10;
			
			
		}
		if(temp==rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
			
		
		
		
		
		

	}

}
