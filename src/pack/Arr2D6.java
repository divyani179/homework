package pack;
/*
 * 6.	Use command line to populate a 
 * two dim array which has 2 rows and 2 columns 
 */
public class Arr2D6 {

	public static void main(String[][] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=0;i<args.length;i++){
			for(int j=0;j<args[i].length;j++)
			{
				int a;
				a=Integer.parseInt(args[i][j]);
				System.out.println(a);
			}
		}
	}

}
