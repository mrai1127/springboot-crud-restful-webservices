package com.rai;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Rows: ");
		int rows = sc.nextInt();

		System.out.println("Col: ");
		int col = sc.nextInt();

		if (rows <= 0 || col <= 0) {
			// print error
		} else {
			for (int i = 1; i <= rows; i++) {
				for (int j = 1; j <= col; j++) {
					System.out.print("B");
				}
				System.out.println();
			}
		}
	}
}
