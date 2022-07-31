/*
 * reverse number
 */
import java.util.Scanner;
public class Reverse_number {

	public static void main(String[] args) {
		
		System.out.print("Enter number:- ");
        /*
         * user input
         */
		Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        int revers = 0, temp = 0;
        /*
         *by using while loop 
         */
        while (number != 0) {

            temp = number % 10;
            revers = revers * 10 + temp;
            number = number / 10;

        }
        System.out.println("Reverse number:-" + " " + revers);


	}

}
