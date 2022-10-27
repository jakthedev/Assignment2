package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class HigherLowerGuessingApp {

	private void getInput() {
		
		Random rand = new Random();
		int r = rand.nextInt(100); 
		System.out.println(r);
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" Pick a number between 1 and 100");
		
		int numberInput = 0;
		int counter = 0;
		
		numberInput = scan.nextInt(); 

		//if (numberInput != r) {
			
		
			while (counter < 4) {
				
				if (numberInput <= 0 || numberInput >= 101) {
				System.out.println("Your guess is not between 1 and 100, please try again");
				numberInput = scan.nextInt();
				}
				
				else if (numberInput < r) {
				System.out.println(" Please pick a higher number " );
				numberInput = scan.nextInt();  
				counter++;
				
			} else if (numberInput > r) {
				System.out.println(" Please pick a lower number " );
				numberInput = scan.nextInt(); 
				counter++;
				
			}  else if (numberInput == r) {
				System.out.println(" Congrats you guess it correctly! ");
				System.exit(0);
			} 
		}
			
			if (numberInput == r) {
				System.out.println(" Congrats you guess it correctly! ");
			}
			
			if (counter == 4 && numberInput != r ) {
					System.out.println(" YOU LOSE! only get 5 tries .... ");
			}
		}

	public static void main(String[] args) {

		new HigherLowerGuessingApp().getInput();

	}
}
