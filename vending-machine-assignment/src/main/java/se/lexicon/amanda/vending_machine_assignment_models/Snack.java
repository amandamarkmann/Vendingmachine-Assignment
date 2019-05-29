package se.lexicon.amanda.vending_machine_assignment_models;

public class Snack extends Product {

	private int sugarPercent;
	
	
	public Snack(String name, int price, int sugarPercent) {
		super(name, price);
		this.sugarPercent = sugarPercent;
	}

	Product purchase(int money) { //om man har råd så får man köpa
		return null;
		
	}
	
	String examine() { //override string to string?
		return null; //this snack?
	}
	
	
	//override?
	public void use() { //ät den!
		
	}

	public int getSugarPercent() {
		return sugarPercent;
	}

	public void setSugarPercent(int sugarPercent) {
		this.sugarPercent = sugarPercent;
	}


}
