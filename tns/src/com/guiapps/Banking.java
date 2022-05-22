package com.guiapps;
import java.util.Scanner;
public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankAccount obj1= new BankAccount("XYZ","BA0001");
obj1.showMenu();
	}
}
class BankAccount{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	BankAccount(String cname, String cid)
	{
		customerName= cname;
		customerId=cid;
		}
	void deposit(int amount)
	{
		if(amount!=0)
		{
			balance=balance+ amount;
			previousTransaction=amount;
			
		}
	}
	void withdraw(int amount)
	{
		if(amount!=0)
		{
			balance= balance- amount;
			previousTransaction=-amount;
			
		}
	}
	void getpreviousTransaction()
	{
		if(previousTransaction>0)
		{
			System.out.println("Deposit:"+ previousTransaction);
			}
		else if(previousTransaction<0)
		{
			System.out.println("withdrawn:  "+Math.abs (previousTransaction));
			}
		else
		{
			System.out.println("no transaction occured");
			
		}
	}
	
	
	
	void showMenu() 
	{
		char option='\0';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome"+ customerName);
		System.out.println("your Id is"+ customerId);
		System.out.println("\n");
		System.out.println("A.checkbalance");
		System.out.println("B.deposit");
		System.out.println("C.withdraw");
		System.out.println("D.previousTransaction");
		System.out.println("E.Exit");
		
		do {
			System.out.println("==============");
			System.out.println("Enter an option");
			System.out.println("===============");
			option=scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
			{
			case 'A':
				System.out.println("==============");
				System.out.println("balance="+balance);
				System.out.println("==============");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("===============");
				System.out.println("enter the amount to deposit:+");
				System.out.println("===============");
				 int amount=scanner.nextInt();
				 deposit(amount);
				 System.out.println("\n");
				 break;
				 
			case 'C':
				System.out.println("===============");
				System.out.println("enter the amount to withdraw:+");
				System.out.println("===============");
				 int amount2=scanner.nextInt();
				 withdraw(amount2);
				 System.out.println("\n");
			break;
			
			case 'D':
				System.out.println("===============");
				getpreviousTransaction();
				System.out.println("===============");
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("===============");
				break;
				
				default:
					System.out.println("invalid option!! please try again");
					break;
			}
			
		}while(option!='E');
		System.out.println("Thank you for using our services");
		
	}
	
	}
