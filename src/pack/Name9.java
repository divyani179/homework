package pack;

import java.util.Scanner;

/*
 * 9.	Write a program to check whether a particular name is available or not in a String array. 
 * In PSVM create a String array with 5 names.
 *  Get a name as user input and search in the array for the name. 
 *  Use for each to iterate the array.
 */
public class Name9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String names[]={"div","shiv","rajat","richa","rishab"};
Scanner s=new Scanner(System.in);
String search=s.nextLine();
	for(String v:names)
	{
		if(v.equalsIgnoreCase(search))
		{
			System.out.println("name has found! name is :"+v);
		}
		else
		{
			System.out.println("404! ");
		}
	}
	
	
	
	}

}
