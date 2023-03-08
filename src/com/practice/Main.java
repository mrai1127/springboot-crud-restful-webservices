package com.practice;

public class Main {
	
	public static void main(String[] args) {
		Address ad = new Address();
		ad.setCity("Irving");
		ad.setHouseNo(3911);
		ad.setState("Texas");
		ad.setStreet("Block Dr");
		ad.setZipCode(75061);
		
		System.out.println(ad);
		System.out.println("The city where i live is " + ad.getCity());
		
		System.out.println(Main.maya());
		System.out.println(Main.phone());
	}
	
	public static String maya() {
		return "What is going on";
	}

	public boolean validation(boolean skip) {
		if(skip == true) {
			return false;
		}else {
		return true;
		}
	}
	
	public static int phone() {
		return 9098;
	}
}
