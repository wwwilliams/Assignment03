/* Westley W Williams
*  CIS 2212-800 Java I FlexPace
*  Assignment 02 - CALCULATOR
*  Started January 14th, 2021
*/

package chap3;
import java.util.Scanner;

public class DemoSelections {

	public static void main(String[] args) {
		//\n starts a new line. I want to create a string for later
		String menu = "Menu"
				+ "\n\t"
				+ "1. Add"
				+ "\n\t"
				+ "2. Subtract"
				+ "\n\t"
				+ "3. Multiply"
				+ "\n\t"
				+ "4. Divide"
				+ "\n\t"
				+ "5. Generate Random Number"
				+ "\n";
		
		double lowerLimit; //this is eventually what the user will enter
		double upperLimit; //this also is a number the user will enter for calculation
		double correctAnswer; //once we perform an operation on the lower and upper limit, we will get the correct answer
		
		System.out.println(menu);//print the menu for the user
		System.out.print("What would you like to do?");
		Scanner theScanner = new Scanner(System.in); //so here, basically the user is entering his choice. It must be between 1 and 5.
		
		int userEntry = theScanner.nextInt(); //user enters an integer
	
		
		//in the first if statement, the user enters an incorrect entry
		if (userEntry > 5 || userEntry < 1) {
			System.out.println("I'm sorry, " + userEntry + " wasn't one of the options.");
		}
		
		//user wishes to add two numbers
		else if (userEntry == 1) {
			System.out.print("What is the first number? ");
			lowerLimit = theScanner.nextDouble();
			System.out.print("What is the second number? ");
			upperLimit = theScanner.nextDouble();
			//add the upper and lower limit
			correctAnswer = lowerLimit + upperLimit;
			System.out.println("Answer: " + correctAnswer);
		}
		
		//user wishes to subtract two numbers
		else if (userEntry == 2) {
			System.out.print("What is the first number? ");
			upperLimit = theScanner.nextDouble();
			System.out.print("What is the second number? ");
			lowerLimit = theScanner.nextDouble();
			//subtract the upper limit from the lower limit
			correctAnswer = upperLimit - lowerLimit;
			System.out.println("Answer: " + correctAnswer);
		}
		
		//user wishes to multiply two numbers
		else if (userEntry == 3) {
			System.out.print("What is the first number? ");
			lowerLimit = theScanner.nextDouble();
			System.out.print("What is the second number? ");
			upperLimit = theScanner.nextDouble();
			//multiply the upper limit and the lower limit
			correctAnswer = lowerLimit * upperLimit;
			System.out.println("Answer: " + correctAnswer);
		} 
		
		//user wishes to divide two numbers
		else if (userEntry == 4) {
			
			System.out.print("What is the first number? ");
			upperLimit = theScanner.nextDouble();
			System.out.print("What is the second number? Do not enter 0 ");
			lowerLimit = theScanner.nextDouble();
			//we want to not allow the user to enter 0 in the denominator of the fraction. Dividing by zero results in infinity
			if (lowerLimit == 0) {
				System.out.println("I'm sorry, you can't divide by zero.");
				//exit the program. We don't want to divide by zero as that gives us infinity.
				System.exit(0);
			}
			//divide the upper limit by the lower limit
			correctAnswer = upperLimit / lowerLimit;
			System.out.println("Answer: " + correctAnswer);
		}
		else if (userEntry == 5) {
			System.out.print("What is the first number? ");
			lowerLimit = theScanner.nextDouble();
			System.out.print("What is the second number? ");
			upperLimit = theScanner.nextDouble();
			//generate a random number
			double randomNumber = lowerLimit + Math.random() * (upperLimit - lowerLimit);
			System.out.println("Answer: " + randomNumber);
		}
		
		 
	}//end of main

}//end of class
