package com.practice;

import java.util.Scanner;
import java.util.stream.IntStream;

public class JavaStream {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a sentence");
		
		String sentence = scanner.nextLine();
		
		String cleanSentence = sentence.toLowerCase().replaceAll("[^a-z0-9]", " ");
		
		boolean isPalindrome = IntStream.range(0, cleanSentence.length()/2)
				.allMatch(i -> cleanSentence.charAt(i) == cleanSentence.charAt(cleanSentence.length() - i -1));
		
		if(isPalindrome) {
			System.out.println("the sentence is a palindrome!");
		}else {
			System.out.println("The sentence is not a palindrome");
		}
	}

}
