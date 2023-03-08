package com.rai;

import java.util.*;

public class Hashing {

	public static void main(String[] args) {
		// country(Key), population(value)
		HashMap<String, Integer> map = new HashMap<>();

		// insertion
		map.put("India", 120);
		map.put("Us", 30);
		map.put("China", 150);

		System.out.println(map);

		map.put("China", 180);
		System.out.println(map);

		// search
		if (map.containsKey("China")) {
			System.out.println("key is presnt in the map");
		} else {
			System.out.println("Key is not present in the map");
		}

//		System.out.println(map.get("China"));
//		System.out.println(map.get("Nepal"));
		
		int arr[] = {12, 15, 18};
		for(int i = 0; i <3; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
		
		
		for(Map.Entry<String, Integer> e:map.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
		
		Set<String> keys = map.keySet();
		for(String key: keys) {
			System.out.println(key + " " + map.get(key));
		}
	}

}
