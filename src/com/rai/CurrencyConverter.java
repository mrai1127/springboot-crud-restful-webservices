package com.rai;

import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		System.out.println("1 Rupee");
		System.out.println("2 Dollor");
		System.out.println("3 Euro");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Choose the currency");
		int choice = scanner.nextInt();
		
		System.out.println("Enter the amount");
		double amount = scanner.nextDouble();
		
		switch(choice) {
		case 1:
			Rupee_to_other(amount);
			break;
//		case 2:
//			Dollar_to_other(amount);
//			break;
//		case 3:
//			Euro_to_other(amount);
//			break;
		default:
			System.out.println("Invalid choice");
		}
		
	}

	private static void Rupee_to_other(double amt) {
		System.out.println("1 Ruppe = " + 0.013 + " Dollar");
		System.out.println();
		
		System.out.println(amt + " Ruppe = " + (amt*0.013) + "Dollor");
		System.out.println();
		
		System.out.println("1 Rupee " + 0.012 + " Euro");
		System.out.println();
		System.out.println(amt + " Ruppe = " + (amt*0.012) + "Euro");
		System.out.println();
	}

}
