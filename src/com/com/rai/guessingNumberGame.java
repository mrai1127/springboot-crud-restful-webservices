package com.com.rai;

import java.util.Scanner;

public class guessingNumberGame {
	
	public static void guessNumber() {
		Scanner sc = new Scanner(System.in);
		
		int number = 1 + (int)(100*Math.random());
		int k = 5;
		int i, guess;
		
		System.out.println(
				"A number is chosen"
				+"between 1 to 100"
				+"Guess the number"		
				+"within 5 trails.");
		
		for(i = 0; i < k; i++) {
			System.out.println("Guess the number:");
			guess = sc.nextInt();
			if(number == guess) {
				System.out.println("Congratulation!"
						+"You guessed the number.");
				break;
			}
			else if(number > guess
					&& i != k - 1) {
				System.out.println("The number is "
						+"greater than " + guess);
			}
			else if(number < guess 
					&& i != k -1) {
				System.out.println("The number is "
						+ "less than" + guess);
			}
		}
		if (i == k) {
			System.out.println("You have exhausted"
					+ " K trails.");
			System.out.println("The number was" + number);
		}
	}
	
	public static void main(String[] args) {
		guessNumber();
	}

}
