package pack;

import java.util.Scanner;

/*
 * class Course
	name,duration,fee as instance variables
	parameterised constructor
class TestCourse
	create an array Course [] courselist = new Course[4];
	populate the array with values using scanner and for loop. 
	Iterate and print the course objects.

 */

public class TestCourse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Course[] courselist=new Course[4];
 Scanner s=new Scanner(System.in);
/* for(String v: courselist )
	}

}*/
	}
class Course{
	String name,duration;
	int fees;
	Course(String name,String Duration , int fees){
		this.name=name;
		this.duration=duration;
		this.fees=fees;
		}
}
}