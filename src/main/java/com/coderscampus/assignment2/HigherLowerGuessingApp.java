package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class HigherLowerGuessingApp {

	public static void main(String[] args) { 
		
		System.out.println(" ****** WELCOME TO THE GUESS GAME ******"); 
		System.out.println(" You have to Guess a number between 0 & 100 to WIN!!! "); 
		System.out.println(" you only have 5 tries so guess wisley ") ; 
		System.out.println( "                    LETS BEGIN ");
		
		Random rand = new Random(); 
		int r = rand.nextInt(101);
		
		Scanner scan = new Scanner(System.in); 
		System.out.println(" Pick a number between 1 and 100"); 
		
		int inputInt = Integer.parseInt(getInput(scan, " Enter an a Number "));
		
		private String getInput(Scanner in, String prompt) {
			System.out.print(prompt); // Tell user what to input 
			int numberInput; 
			while (numberInput != r) {
				
			}
		}
		
//		if (firstGuess < 0 || firstGuess > 100) {
//			System.out.println(" Your guess is not between 1 and 100, please try again ");
//		} else if(firstGuess == r ){
//			System.out.println(" You guess it!! ********* Congrats you won ********* ");
//		} else if( firstGuess < r ) {
//			System.out.println(" Please pick a higher number "); 
//		} else if ()
	}

 }
