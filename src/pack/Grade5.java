package pack;

import java.util.Scanner;

/*
 * 5.	Write a program to calculate the sum of three marks, 
 * calculate average  and fix grade. Use Scanner and if.
 */
public class Grade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int m1,m2,m3;
float avg;
int sum;
Scanner s=new Scanner(System.in);
m1=s.nextInt();
m2=s.nextInt();
m3=s.nextInt();
sum=m1+m2+m3;
avg=sum/3;
if(avg==10){
	System.out.println("A grade");
}
else if(8<avg && avg<9){
	System.out.println("B GRADE");
	
}
else
{
	System.out.println("C GRADE");
}
	}

}
