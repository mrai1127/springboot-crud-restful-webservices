package com.pattern;

import java.util.stream.IntStream;

public class Check_Palindrome_String_Using_Streams_Java8 {
	public static void main(String[] args) {
		
		//check if "radar" is palindrome
		System.out.println("Is radar a Palindrome? - " + isPalindrome("radar"));
		
		//check if "apple" is Palindrome
		System.out.println("Is apple a Palindrome? - " + isPalindrome("apple"));
	}
	
	public static boolean isPalindrome(String originalString) {
		String tempString = originalString.replace("\\s+", "").toLowerCase();
		
		return IntStream.range(0, tempString.length()/2).noneMatch(i -> tempString.charAt(i) != 
				tempString.charAt(tempString.length()- i - 1));
	}

}
