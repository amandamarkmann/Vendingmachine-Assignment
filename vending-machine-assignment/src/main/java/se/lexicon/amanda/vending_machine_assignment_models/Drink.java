package se.lexicon.amanda.vending_machine_assignment_models;

public class Drink extends Product {

	
	private String volume;
	
	
	
	public Drink(String name, int price, String volume) {
		super(name, price);
		this.volume = volume;
	}

	Product purchase(int money) { 
		return null;
	}
	
	@Override
	String examine() {
		return getName() + " " + getVolume() + " " + getPrice();
	}
	
	@Override
	public void use() { 
		System.out.println("What a refreshing drink you just had!");
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}
	
	
}
