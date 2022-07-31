/*
 * fibonacci series
 */
import java.util.Scanner;
public class Fibbonacci_series {

	public static void main(String[] args) {
	/*
	 * taking variable
	 */
		int term;
		int a=0;
		int b=1;
		int c;
		
		System.out.println("Enter term");
		/*
		 * taking input
		 */
		Scanner user = new Scanner(System.in);
		
		term = user.nextInt();
		/*
		 * satisfying condition by for loop
		 */
		for (int i=1;i<=term;i++) {
			
			System.out.print(a+" ");
			
			c=a+b;
			a=b;
			b=c;
			
			
		}
		

	}

}
