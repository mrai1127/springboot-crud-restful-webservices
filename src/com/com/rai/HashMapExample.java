package com.com.rai;

import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		
		System.out.println(map.get("one"));
		
		map.putIfAbsent("three", 3);
		map.putIfAbsent("four", 4);
		
		map.replace("three", 3, 5);
		
		for(String key: map.keySet()) {
			System.out.println(key);
		}
		
		for(int value : map.values()) {
			System.out.println(value);
		}
		
		if(map.containsKey("four")) {
			System.out.println("four is a key in the map");
		}else {
			System.out.println("Four is not a key in the map");
		}
	}
}
