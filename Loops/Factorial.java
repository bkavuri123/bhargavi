package Loops;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
        System.out.println("Enter the number: ");
        Scanner s = new Scanner(System.in);
        number = s.nextInt();
        s.close();
        long fact = 1;
        int i = 1;
        while(i<=number)
        {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
	}

}
