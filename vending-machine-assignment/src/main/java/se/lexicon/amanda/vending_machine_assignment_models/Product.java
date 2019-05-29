package se.lexicon.amanda.vending_machine_assignment_models;

public abstract class Product {

	private String name;
	private int price;
	
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//override string tostring?
	String examine() { //visa vilka produkter man kan välja mellan
		return null;
	} 
	
	
	abstract Product purchase(int money); 
	
	
	abstract void use(); //om man ska äta eller dricka den
	
	
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}
