package se.lexicon.amanda.vending_machine_assignment;

import se.lexicon.amanda.vending_machine_assignment_models.Drink;
import se.lexicon.amanda.vending_machine_assignment_models.Food;
import se.lexicon.amanda.vending_machine_assignment_models.Product;
import se.lexicon.amanda.vending_machine_assignment_models.Snack;

public class VendingMachineImpl implements VendingMachine {

	
	
	public int[] denominations = new int[]{1, 5, 10, 20, 50, 100, 500, 1000};
	
	
	Product[] PRODUCT = {
			new Drink("Lemonade", 25, "250 cl"),
			new Drink("Icetea", 42, "500 cl"),
			new Food("Delicious vegan dish", 85, 400),
			new Food("Tacos", 65, 302),
			new Snack("Dates", 37, 75),
			new Snack("Vegan proteinbar", 29, 50),
	};
	

	private int moneyPool;

	boolean addMoney = true;
	
	
	public boolean addMoney(int money) {
		
		
		for(int denomination : denominations) {
			if(denomination == money) {
				moneyPool = moneyPool + money;
				return true;
			}
			
		}
		return false;
		
			//och vill fortsätta fylla på moneypool
	
	}

	public Product buy(int choice) {
		
		//please select one or more products - visa produkter samt nr de finns på
		//köparen trycker på det nummer som produkten visas på
		//returnera produkt
		
		Product bought = null;
		
		switch(choice) {
		case 1: 
			bought = PRODUCT[0].purchase(moneyPool);
			break;
		case 2:
			bought = PRODUCT[1].purchase(moneyPool);
			break;
		case 3:
			bought = PRODUCT[2].purchase(moneyPool);
			break;
		case 4:
			bought = PRODUCT[3].purchase(moneyPool);
			break;
		case 5:
			bought = PRODUCT[4].purchase(moneyPool);
			break;
		case 6:
			bought = PRODUCT[5].purchase(moneyPool);
			break;
		}
		
		if(bought != null) {
			moneyPool = moneyPool - bought.getPrice();
		}
		return bought;
	}

	public int returnChange() {
		
		int change = moneyPool;
		moneyPool = 0;
		
		//print how much change
		//if moneyPool > 0, return change
		
		return change;
	}
	
	
	public void presentProducts() {
		
		
	}

	public int getBalance() {
		//visa moneyPool
		return 0;
	}

	@Override
	public Product pickProduct(int number) {
		if(number > products.lenght-1 || number < 0) {
			return null;
		}
		return product[number];
	} //behöver nog inte ens den här


	@Override
	public void printMoneyAmount() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
