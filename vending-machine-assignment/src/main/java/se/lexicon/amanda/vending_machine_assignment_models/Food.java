package se.lexicon.amanda.vending_machine_assignment_models;

public class Food extends Product {

	private int calories;
	
	
	public Food(String name, int price, int calories) {
		super(name, price);
		this.calories = calories;
	}

	Product purchase(int money) { //om man har råd så får man köpa
		return null;
	}
	
	String examine() { //override string tostring?
		return null;
	}
	
	//override?
	public void use() { //ät den
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	
}
