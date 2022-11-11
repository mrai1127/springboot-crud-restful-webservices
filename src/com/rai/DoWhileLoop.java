package com.rai;

import java.util.Scanner;

public class DoWhileLoop {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Base: ");
		int b = sc.nextInt();
		System.out.println("Exp: ");
		int e = sc.nextInt();
		
		int result = 1, i =1;
		do {
			result = result*b;
			i++;
		}while(i <= e);
		System.out.println(result);
	}

}
