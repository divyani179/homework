package pack;

public class Week8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String ch=args[0];
 
 switch(ch)
 {
 case "sunday" : case "saturday" :
	 System.out.println("it's weekend! Let's party! ");
 case "monday" : case "tuesday" : case "wednesday" : case "thursday" : case "friday" :
	 System.out.println("weekday!");
 }
	}

}
