package pack;

import java.util.Scanner;

/*
 * 7.	Create a one dim array of int data type having 4 values. Populate it by
 *  getting user input from scanner.  Find out the bigger number in this array
 */
public class Arr7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[4];
		int b=0;
Scanner s=new Scanner(System.in);
a[0]=s.nextInt();
a[1]=s.nextInt();
a[2]=s.nextInt();
a[3]=s.nextInt();
for(int i=0;i<4;i++){
	for(int j=i;j<4;j++)
	{
		if(a[i]>a[j])
		{
			b=a[i];
		}
	}
}

System.out.println("largest no :"+b);
	}

}
