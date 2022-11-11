package com.rai;

import java.util.Scanner;

public class ScannerTest {
	
	

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character : ");
		boolean ij = scanner.nextLine().equalsIgnoreCase(ij);
		System.out.println("value " + ij);
		char c = scanner.next().charAt(0);
		System.out.println("Character :" + c);
	}

}
