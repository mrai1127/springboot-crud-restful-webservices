package com.com.rai;

import java.util.ArrayList;

public class ForEach {
	
	public static void main(String[] args) {
		int [] numbers = {1, 2, 3, 4, 5};
		
		for(int number : numbers) {
			System.out.println(number);
		}
		ForEach.Example();
	}
	
	public static void Example() {
		ArrayList<String> names = new ArrayList<>();
		names.add("Maya");
		names.add("Chaya");
		names.add("Daya");
		names.add("Baya");
		
		for(String name : names) {
			System.out.println(name);
		}
		
	}

}
