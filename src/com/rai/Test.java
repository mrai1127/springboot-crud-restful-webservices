package com.rai;

public class Test {
	public static void main(String[] args) {
		if(check(rate, salePrice)) {
			System.out.println(convertCurr(0.5, 80));
		}
		
		
		
	}
	
	public boolean check(String rate, String salePrice) {
		
	if(null != rate && null != salePrice) {
		return true;
	}
	return false;
	}
	
	public static double convertCurr(double rate, double salePrice) {
		double Total = salePrice*rate;
		return Total;
	}
}
