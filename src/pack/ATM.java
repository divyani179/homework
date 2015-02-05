package pack;

import java.util.Scanner;

/*
 * 13.	Write a  program to build a simple bank application which has withdraw, 
 * deposit and getBalance method. 
class Bank 
    balance as instance variable
    void withdraw(int x), void deposit(int x), double getBalance()  as methods
class ATM 
	PSVM - 
get users choice for withdraw or deposit or getBalance using scanner
Use Switch or if get amount from user and call the methods
*/
public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
Scanner s=new Scanner(System.in);
String choice;
		System.out.println("enter ur choice");
		choice=s.next();
		if(choice.equalsIgnoreCase("withdraw"))
		{
			b.withdraw(1000);
		}
		else if(choice.equalsIgnoreCase("deposit"))
		{
			b.deposit(1500);
		}
		else
		{
			b.getBalance();
		}
	}

}
class Bank
{
	double balance;
	void withdraw(int x)
	{
		balance=balance-x;
		System.out.println("withdraw amount is"+x);
		System.out.println("ur current balance is :"+balance);
	}
	void deposit(int x)
	{    
		balance=balance+x;
		System.out.println("deposit amount is "+x);
		System.out.println("ur current balance is :"+balance);
	}
	double getBalance()
	{
		System.out.println("ur current balance is :"+balance);
		return balance;
	}
}
