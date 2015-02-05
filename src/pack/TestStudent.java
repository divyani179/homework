package pack;

import java.util.Scanner;

/*
 * 14.	Write a program to print grades of two student objects.
class Student
	name, id and city as instance variables.
	parameterised constructor 
	void getDetails() to print the details of student
	String getGrade(int [] marks) to calculate sum, average, grade as A/B/C .
class TestStudent
	PSVM - 
	create 2 student objects, 
	get marks using scanner and populate in array
	call both the methods 
*/
class Student{
	

String name,city;
int id;
Student(String name, int id,String city)
{
	this.name=name;
	this.id=id;
	this.city=city;
}
void getDetails()
{
	System.out.println("name is :"+name);
	System.out.println("id is :"+id);
	System.out.println("city is :"+city);
}
String getGrades(int[] marks)
{int sum=0,c;
float avg;
String grade;
	for(int v:marks)
	{
		sum=sum+v;
		
	}
	System.out.println("total marks are :"+sum);
	c=marks.length;
	avg=sum/c;
	System.out.println("average is :"+avg);
	if(avg==10)
	{   

		System.out.println("grade : A");
		grade ="A";
	}
	else if(avg>8 && avg<10)
	{
		System.out.println("grade : B");
		grade ="B";
	}
	else
	{
		System.out.println("Grade : C");
	   grade ="C";
	}
	return grade;
}
}
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
Student s1=new Student("divyani",113078,"bengaluru");
Student s2=new Student("shivani",179,"jaipur");
Scanner s=new Scanner(System.in);
int[] marks=new int[3];

System.out.println("enter marks for student 1");
for(m=0;m<3;m++)
{
	marks[m]=s.nextInt();
}

s1.getGrades(marks);
s1.getDetails();
System.out.println("enter marks for student 2");
for(m=0;m<3;m++)
{
	marks[m]=s.nextInt();
}

s2.getGrades(marks);
s2.getDetails();

	}

}
