package com.practice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamProg {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter a sentence: ");
		String sentence = scanner.nextLine();
		
		String[] words = sentence.split("\\s+");
		String palindromeWords = Arrays.stream(words).filter(PalindromeChecker::isPalindrome)
				.collect(Collectors.joining(", "));
		
		System.out.println("Palindrome words: " + palindromeWords);
		
	}
	
	private static boolean isPalindrome(String word) {
		return word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
	}
}
