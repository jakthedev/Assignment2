package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class HigherLowerGuessingApp {

	private void getInput() {
		
		Random rand = new Random();
		int r = rand.nextInt(100);
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" Pick a number between 1 and 100");
		
		int numberInput = 0;
		int counter = 0;
		
		numberInput = scan.nextInt(); 

		while (numberInput != r) {
			
			while (numberInput <= 0 || numberInput >= 101) {
				System.out.println("Your guess is not between 1 and 100, please try again");
				numberInput = scan.nextInt();
			} 
			
			 if (numberInput < r) {
				counter++;
				System.out.println(" Please pick a higher number " );
				numberInput = scan.nextInt();  
			} else if (numberInput > r) {
				counter++;
				System.out.println(" Please pick a lower number " );
				numberInput = scan.nextInt(); 
			} else if (numberInput == r) {
				System.out.println(" Congrats you guess it correctly! ");
				break;
			} 
			
			if (counter > 4 ) {
				System.out.println(" YOU LOSE! only get 5 tries .... ");
				break;
			}
		}
	}

	public static void main(String[] args) {

		new HigherLowerGuessingApp().getInput();

	}
}
