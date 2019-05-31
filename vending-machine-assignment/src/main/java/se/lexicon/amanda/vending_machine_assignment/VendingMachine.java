package se.lexicon.amanda.vending_machine_assignment;


public interface VendingMachine {

	boolean addMoney(int money);

	
	Product buy(int money, int prodNum);
	
	int returnChange();

	
	void presentProducts();
	
	int getBalance();
	
	
	

	
	
}



