package devops1;

import java.util.Scanner;
import java.util.logging.Logger;

public class Multiplication {

	public static void main(String[] args) {
        /* This reads the input provided by user
         * using keyboard
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");

        // This method reads the number provided using keyboard
        int num1 = scan.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        
        int productvalue = multiply(num1,num2);
        
        System.out.println("Multiply Values :" + productvalue);
        
        
 
	}
	
	static int multiply(int num1, int num2)
	{
	       // Calculating product of two numbers
        int product = num1*num2;
        
        
        return product;

	}

}
