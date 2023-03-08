package com.practice;

import java.util.Scanner;

public class RegularPalindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String sentence = scanner.nextLine();
		
		String[] words = sentence.split("\\s+");
		
		for(String word : words) {
			if(isPalindrome(word)) {
				System.out.println(word + " is a palindrome");
			}
		}
	}
	
	private static boolean isPalindrome(String word) {
		int length = word.length();
		for(int i = 0; i < length/2; i++) {
			if(word.charAt(i) != word.charAt(length - 1 - i)) {
				return false;
			}
		}
		return true;
	}

}
