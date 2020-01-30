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
		testItem.setReplacementCost(testValue);
		assertEquals(testValue, testItem.getReplacementCost());
		}
	
	@Test
	public void testSavingsItemCashBalance() {
		BigDecimal testBalance = new BigDecimal (500.00);
		testItem.setCashBalance(testBalance);
		assertEquals(testBalance, testItem.getCashBalance());
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
		assertEquals(monthlyPaymentsTest,testLogic.calcMonthlyPayments(testItem));
		}
	
}
