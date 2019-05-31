package se.lexicon.amanda.vending_machine_assignment;

import se.lexicon.amanda.vending_machine_assignment_models.Drink;
import se.lexicon.amanda.vending_machine_assignment_models.Food;
import se.lexicon.amanda.vending_machine_assignment_models.Product;
import se.lexicon.amanda.vending_machine_assignment_models.Snack;


public class VendingMachineImpl implements VendingMachine {

	
	Drink drink1 = new Drink("Lemonade", 25, "250 cl");
	Drink drink2 = new Drink("Icetea", 42, "500 cl");
	Food food1 = new Food("Delicious vegan dish", 85, 400);
	Food food2 = new Food("Tacos", 65, 302);
	Snack snack1 = new Snack("Dates", 37, 75);
	Snack snack2 = new Snack("Vegan proteinbar", 29, 50);
	
	
	public int[] denominations = {1, 5, 10, 20, 50, 100, 500, 1000};
	
	Product[] products;
	
	int moneyPool;
	
	
	public boolean addMoney(int money) {
		
		
		//jämföra array med money man vill sätta in
		if {
			return true;
			
		}
			
		//money + money = moneypool
		//om man lägger till pengar blir summan större annars sluta fylla på och gå till välj produkt?
	
		
		return false;
	}

	public Product buy(int money, int prodNum) {
		
		//while choosing and moneypool>price
		//please select one or more products - visa produkter samt nr de finns på
		//switch(prodnum) med produkter och pris?
		//köparen trycker på det nummer som produkten visas på
		//returnera produkt och dra av pengar från moneypool
		
//		switch(choise) {
//		case 1: 
//			food1;
//			break;
//		case 2:
//			food2;
//			break;
//		case 3:
//			snack1;
//			break;
//		case 4:
//			snack2;
//			break;
//		case 5:
//			drink1;
//			break;
//		case 6:
//			drink2;
//			break;
	//	
//		}
		return null;
	}

	public int returnChange() {
		// change = moneypool - every bought productprice
		//använda % ?
		//print how much change
		//if moneypool > 0, return change
		
		return 0;
	}

	public void presentProducts() {
		
		
	}

	public int getBalance() {
		//visa moneypool
		return 0;
	}
	
	
	
	
	

}
