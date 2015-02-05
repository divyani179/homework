package pack;

import java.util.Scanner;

public class Greater3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		int m;
Scanner s= new Scanner(System.in);
System.out.println("enter the values");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();

if(a>b && a>c)
{
	System.out.println("a is greatest");
	
}
else if(b>a && b>c)
{
	System.out.println("b is greatest");
	
}
else
{
	System.out.println("c is greatest");
}
	}

}
