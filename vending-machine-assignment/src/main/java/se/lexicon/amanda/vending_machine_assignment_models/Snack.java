package se.lexicon.amanda.vending_machine_assignment_models;

public class Snack extends Product {

	private int sugarPercent;
	
	
	public Snack(String name, int price, int sugarPercent) {
		super(name, price);
		this.sugarPercent = sugarPercent;
	}

	Product purchase(int money) {
		return null;
	}
	
	@Override
	String examine() {
		return getName() + " " + getSugarPercent() + " " + getPrice(); 
	}
	
	
	@Override
	public void use() { 
		System.out.println("No more sugarcravings for you!");
		
	}

	public int getSugarPercent() {
		return sugarPercent;
	}

	public void setSugarPercent(int sugarPercent) {
		this.sugarPercent = sugarPercent;
	}


}
