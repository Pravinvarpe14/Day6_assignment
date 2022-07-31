/*
 * prime number
 */
import java.util.Scanner;
public class Prime_number {

	public static void main(String[] args) {
		/*
		 * taking variable
		 */
		int n=0;
		int count=0;
		System.out.println("Enter the number");
		
		/*
		 * user input
		 */
		Scanner user = new Scanner(System.in);
		
		n=user.nextInt();
		/*
		 * using for loop 
		 */
		for (int i=1; i<=n; i++) {
			
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
			
			System.out.println("The number is prime number");
		
		else
			System.out.println("The number is not prime number");
	}

}
