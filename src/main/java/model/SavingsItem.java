package model;

import java.math.BigDecimal;
import java.util.Date;


public class SavingsItem {
	
	//Declare variables
	private String name;
	private BigDecimal replacementCost;
	private BigDecimal cashBalance;
	private BigDecimal balanceLeft;	
	private int monthsLeft;

	//Constructors
	public SavingsItem() {
		super();
	}

	public SavingsItem(String name, BigDecimal replacementCost, BigDecimal cashBalance, BigDecimal balanceLeft,
			int monthsLeft) {
		super();
		this.name = name;
		this.replacementCost = replacementCost;
		this.cashBalance = cashBalance;
		this.balanceLeft = balanceLeft;
		this.monthsLeft = monthsLeft;
	}


	
	
	//Getters and Setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getReplacementCost() {
		return replacementCost;
	}

	public void setReplacementCost(BigDecimal replacementCost) {
		this.replacementCost = replacementCost;
	}

	public BigDecimal getCashBalance() {
		return cashBalance;
	}

	public void setCashBalance(BigDecimal cashBalance) {
		this.cashBalance = cashBalance;
	}

	public BigDecimal getBalanceLeft() {
		return balanceLeft;
	}

	public void setBalanceLeft(BigDecimal balanceLeft) {
		this.balanceLeft = balanceLeft;
	}

	public int getMonthsLeft() {
		return monthsLeft;
	}

	public void setMonthsLeft(int monthsLeft) {
		this.monthsLeft = monthsLeft;
	}
}
	
	
