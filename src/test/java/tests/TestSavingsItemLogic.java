package tests;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import model.SavingsItem;
import model.SavingsLogic;

public class TestSavingsItemLogic {

	SavingsItem testItem = new SavingsItem();
	SavingsLogic testLogic = new SavingsLogic();
	
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSavingsItemName() {
		testItem.setName("MacBookPro");
		String name = testItem.getName();
		String testName = "MacBookPro";
		assertEquals(name, testName);
		}
	
	@Test
	public void testSavingsItemReplacementCost() {
		BigDecimal testValue = new BigDecimal (1500.00);
		BigDecimal testValueCheck = new BigDecimal (1500.00);
		testItem.setReplacementCost(testValue);
		assertTrue(testValueCheck.compareTo(testItem.getReplacementCost()) == 0);
		}
	
	@Test
	public void testSavingsItemCashBalance() {
		BigDecimal testBalance = new BigDecimal (500.00);
		BigDecimal testBalanceCheck = new BigDecimal (500.00);
		testItem.setCashBalance(testBalance);
		assertTrue(testBalanceCheck.compareTo(testItem.getCashBalance()) == 0);
		}

	@Test
	public void testSavingsItemBalanceLeft() {
		BigDecimal testBalanceLeft = new BigDecimal(1000.00);
		testItem.setBalanceLeft(testBalanceLeft);
		assertTrue((testBalanceLeft.compareTo(testItem.getBalanceLeft())) == 0);
		}

	@Test
	public void testSavingsItemMonthsLeft() {		
		testItem.setMonthsLeft(5);
		assertEquals(5, testItem.getMonthsLeft());
		}

	@Test
	public void testSavingsItemMonthlyPayments() {
		BigDecimal balanceLeftTest = new BigDecimal(1000.00);
		BigDecimal monthlyPaymentsTest = new BigDecimal(100.00);
		testItem.setMonthsLeft(10);
		testItem.setBalanceLeft(balanceLeftTest);
		assertTrue(monthlyPaymentsTest.compareTo(testLogic.calcMonthlyPayments(testItem)) == 0);
		}
	
}
