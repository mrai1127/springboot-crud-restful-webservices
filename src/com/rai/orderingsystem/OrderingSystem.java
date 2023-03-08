package com.rai.orderingsystem;

import java.util.Scanner;

public class OrderingSystem {
	
	public static Scanner input = new Scanner(System.in);
	public static String again;
	public static int choose, quantity=1;
	public static double total=0,pay;
	
	public static void menu() {
		System.out.println("\t\t\t\t+==========================================+");
		System.out.println("\t\t\t\t            FASTFOODMENU                              ");
		System.out.println("\t\t\t\t  1. Biryani                  Php. 13.00");
		System.out.println("\t\t\t\t  2. Chiken Tikka             Php. 17.00");
		System.out.println("\t\t\t\t  3. Chowmein                 Php. 10.00");
		System.out.println("\t\t\t\t  4. Cancel                    ");
		System.out.println("\t\t\t\t+==========================================+");
	}
	
	public static void order() {
		System.out.println("Press 1 to Biryani, Press 2 to Chicken Tikka, Press 3 to"
				+ " Chowmein and Press 4 to Cancel");
		System.out.println("Pick your option?");
		choose = input.nextInt();
		
		//condition
		if(choose==1) {
			System.out.println("You choose Biryani");
			System.out.print("How many Biryani you want to purchase?");
			quantity = input.nextInt();
			total = total + (quantity * 45);
			
			System.out.println("You want to purcahse again?");
			System.out.println("Press Y for Yes and N for No: ");
			again = input.next();
			
			if(again.equalsIgnoreCase("Y")) {
				order(); // call the method you to create
			}else {
				System.out.println("Enter a payment");
				pay = input.nextDouble();
				total = total-pay;
				System.out.println("Total price is " + total);
			}
		}
	}
	
	public static void main(String[] args) {
		//call the menu or the method you create to see the menu
		menu();
		order(); 
	}

}
