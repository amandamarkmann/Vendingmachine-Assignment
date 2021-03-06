package se.lexicon.amanda.vending_machine_assignment_models;

public abstract class Product {

	private String name;
	private int price;
	
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	

	abstract String examine();
	
	
	public Product purchase(int money) {

		if(getPrice() > money) {
			return null;
		}else {
			return this;
		}
	}
	
	abstract void use();
	
	
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
