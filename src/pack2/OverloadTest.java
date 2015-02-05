package pack2;

import java.util.Scanner;

/*
 * 16.	Calculate bonus of different employees using method overloading 
 * using a method calcBonus(int allowance) and 
 * overloading with  calcBonus(int allowance, int carallow)
class Employee
   double calcBonus(int allowance) ----> for pgmmer
  double calcBonus(int allowance, int carallow)---------> for mgr
double calcBonus(int allowa, int carallow, int HouseAllow)--> for director
class OverloadTest
	Get user choice as Manager, programmer, Director. 
	On getting choice call appropriate method of employee class with some value for allowance

 */
class Employee{
	double bonus;
	 double calcBonus(int allowance){
		 bonus=bonus+allowance;
		 return bonus;
	 }
	 double calcBonus(int allowance, int carallow){
		 bonus=bonus+allowance+carallow;

		return bonus;
		 
	 }
	 double calcBonus(int allowa, int carallow, int HouseAllow){
		 bonus=bonus+allowa+carallow+HouseAllow;
		return bonus;
		 
	 }
	 
	 
}
public class OverloadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch;
 System.out.println("enter ur choice for whom u wanna calculate d bonus");
 Scanner s=new Scanner(System.in);
 ch=s.next();
 Employee e=new Employee();
 if(ch.equalsIgnoreCase("programmer")){
	 System.out.println(e.calcBonus(1000));
 }
 else if(ch.equalsIgnoreCase("manager"))
 {
         	 System.out.println(e.calcBonus(1500, 1200));
 }
 else
 {
	 System.out.println(e.calcBonus(1000, 1500, 800));
 }
 
 
	}

}
