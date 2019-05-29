package se.lexicon.amanda.vending_machine_assignment_models;

public class Drink extends Product {

	
	private String volume;
	
	
	
	public Drink(String name, int price, String volume) {
		super(name, price);
		this.volume = volume;
	}

	Product purchase(int money) { //om man har råd så får man köpa
		return null;
	}
	
	String examine() { //override string tostring?
		return null;
	}
	
	//override?
	public void use() { //drick den!
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}
	
	
}
