package com.piz.za;

public class DeluxePizza extends Pizza {

	public DeluxePizza(boolean veg) {
		super(veg);
		super.addExtraCheese();
		super.addExtraToppings();
	}

}
