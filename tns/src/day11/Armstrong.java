package day11;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=456,rem;
		int t1=no;
		int length=0;
		while(t1!=0)
		{
			length=length+1;
			t1=t1/10;
			
		}
int t2=no;
int arm=0;
while(t2!=0)
{
	int mul=1;
	rem=t2%10;
	for(int i=1;i<=length;i++)
	{
		mul=mul*rem;
		
	}
	arm=arm+mul;
	t2=t2/10;
	
	
}
if(arm==no) {
	System.out.println(no+"armstrong number");
	
}
else
{
	System.out.println(no+"not armstrong number");
}
	}

}