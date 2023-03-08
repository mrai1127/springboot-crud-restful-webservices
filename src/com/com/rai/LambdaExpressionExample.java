package com.com.rai;

import java.util.function.Function;

public class LambdaExpressionExample {
	public static void main(String[] args) {
		Function<String, Integer> getLength = s -> s.length();
		
		int length = getLength.apply("Mero maya");
		
		System.out.println(length);
	}

}
