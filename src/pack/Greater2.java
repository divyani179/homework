package pack;

import java.util.Scanner;

public class Greater2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		int min;
Scanner s=new Scanner(System.in);
System.out.println("enter 3 nos");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
min=a > b ? (a > c ? a : c) : (b > c ? b : c) ;

System.out.println(min);
	}

}
