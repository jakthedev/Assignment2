package com.coderscampus.assignment2;

import java.util.Random;
import java.util.Scanner;

public class HigherLowerGuessingApp {

	private void getInput() {
		
		Random rand = new Random();
		int r = rand.nextInt(101);
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" Pick a number between 1 and 100");
		
		int numberInput = scan.nextInt();
		int counter = 0;

		while (numberInput != r) {
			numberInput = scan.nextInt();
			counter = counter++;

			if (numberInput < r) {
				System.out.println(" Please pick a higher number " );
			} else if (numberInput > r) {
				System.out.println(" Please pick a lower number " );
			} else if (numberInput == r) {
				System.out.println(" Congrats you guess it correctly! ");
				break;
			} else if (counter < 5) {
				System.out.println(" YOU LOSE! only get 5 tries .... ");
				break;
			}
		}
	}

	public static void main(String[] args) {

		new HigherLowerGuessingApp().getInput();

	}
}
