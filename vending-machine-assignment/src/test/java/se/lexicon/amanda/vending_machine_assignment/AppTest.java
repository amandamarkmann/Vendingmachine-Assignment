package se.lexicon.amanda.vending_machine_assignment;

import org.junit.Test;

import junit.framework.Assert;

public class AppTest {

	VendingMachineImpl VendingMachineImplTest = new VendingMachineImpl();
	
	@Test
	public void Test_EqualsTrue() {
		Assert.assertTrue(VendingMachineImplTest.addMoney(20));
	}
	
}
