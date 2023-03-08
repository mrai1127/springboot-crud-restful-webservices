package com.piz.za;

public class Pizza {

	private int price;
	private boolean veg;
	private int extraCheesePrice = 100;
	private int extraToppingsAdded = 150;
	private int backPack = 20;
	private int basePizzaPrice;
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppingAdded = false;
	private boolean isOptedForTakeAway = false;

	public Pizza(boolean veg) {
		this.veg = veg;

		if (this.veg) {
			this.price = 300;
		} else {
			this.price = 400;
		}
		basePizzaPrice = this.price;
	}

	public void addExtraCheese() {
		isExtraCheeseAdded = true;
		this.price += extraCheesePrice;
	}

	public void addExtraToppings() {
		isExtraToppingAdded = true;
		this.price += extraToppingsAdded;
	}

	public void takeAway() {
		isOptedForTakeAway = true;
		this.price += backPack;
	}

	public void getBill() {
		String bill = " ";
		System.out.println("Pizza: " + basePizzaPrice);
		if (isExtraCheeseAdded) {
			bill += "Extra chesse is added: " + extraCheesePrice + "\n";
		}
		if (isExtraToppingAdded) {
			bill += "Extra chesse is added: " + extraToppingsAdded + "\n";
		}
		if (isOptedForTakeAway) {
			bill += "Extra chesse is added: " + backPack + "\n";
		}
		bill += "Bill: " + this.price + "\n";
		System.out.println(bill);
	}

}
