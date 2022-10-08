package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class HigherLowerGuessingApp {

	private void getInput() {
		
		Random rand = new Random();
		int r = rand.nextInt(101);
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" Pick a number between 1 and 100");
		
		int numberInput = 0;
		int counter = 0;
		
		numberInput = scan.nextInt(); 

		while (numberInput != r) {
			
			
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
			
			if (counter > 3 ) {
				System.out.println(" YOU LOSE! only get 5 tries .... ");
				break;
			}
		}
	}

	public static void main(String[] args) {

		new HigherLowerGuessingApp().getInput();

	}
}
