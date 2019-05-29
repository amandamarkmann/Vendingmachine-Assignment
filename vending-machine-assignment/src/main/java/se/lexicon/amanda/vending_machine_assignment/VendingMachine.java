package se.lexicon.amanda.vending_machine_assignment;

import se.lexicon.amanda.vending_machine_assignment_models.Product;

public interface VendingMachine {

	boolean addMoney(int money);
	
	Product buy(int money, int prodNum);
	
	int returnChange();
	
	void presentProducts();
	
	int getBalance();
	
	
	
}
