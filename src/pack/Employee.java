package pack;

import java.util.Scanner;

/*
 * 12.	Write a program to print a welcome message to user after getting his name
 *  using scanner (method with parameter)
class Employee 
      String  greet(String name)  method 
class Test 
	PSVM  - 
	create Employee object and call greet method passing value

 */
public class Employee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		String name=s.next();
		Employee e=new Employee();
		System.out.println(e.greet("shivani"));
		
	}
	
	String greet(String name1)
	{
	return "welcome"+name1;
	
	}

}
