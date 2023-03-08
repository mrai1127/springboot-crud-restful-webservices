package com.com.rai;

public class Test {
	
	public static void main(String[] args) {
		
//		StringBuffer str = new StringBuffer("I like you");
//		System.out.println("\n\tBefore Append: " + str);
//		str.append(".rai");
//		System.out.println("\n\tAfter Append: " + str);
//		str.insert(2, "like");
//		System.out.println("\n\tAfter Insert: " + str);
		
//		StringBuilder sb = new StringBuilder("hello");
//		for(int i = 0; i<sb.length()/2; i++) {
//			int front = i;
//			int back = sb.length() - 1 - i; //5-1-0 => 4
//			
//			char frontChar = sb.charAt(front);
//			char backChar = sb.charAt(back);
//			
//			sb.setCharAt(front, backChar);
//			sb.setCharAt(back, frontChar);
//		}
//		System.out.println(sb );
		
		StringBuffer sb = new StringBuffer("Mausam");
		sb.append(" Rai");
		
		System.out.println(sb);
	}

}
