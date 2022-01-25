package numberInput;

import java.util.Scanner;

public class NumberInput {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number between 10 and 100.");
		int userInput = keyboard.nextInt();

			
			if((userInput <10) || (userInput > 100))
			System.out.println("Computer says no. Number out of range.");
		
			else {
				System.out.println("Thank you for your input.");
				
		
			
		}
			
		
		
		
		
			
		
	}
	

}
