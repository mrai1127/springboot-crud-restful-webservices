package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ProgStreamJava {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = scanner.nextLine();
		
		String[] words = sentence.split(" ");
		
		boolean containsPalindromeWords = Arrays.stream(words).filter(word -> isPalindrome(word))
				.peek(word -> System.out.println(word)).count() > 0;
		
		if(containsPalindromeWords) {
			System.out.println("The sentence contains palindrome words.");
		}else {
			System.out.println("The sentence does not contain palindrome words.");
		}
		
		scanner.close();
		
	}
	
	public static boolean isPalindrome(String word) {
		return new StringBuilder(word).reverse().toString().equalsIgnoreCase(word);
	}

}
