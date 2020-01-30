package model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class SavingsLogic {
	
	public BigDecimal calcMonthlyPayments(SavingsItem savingsItem) {
		int monthsLeft = savingsItem.getMonthsLeft();
		
		return savingsItem.getBalanceLeft().divide(BigDecimal.valueOf(savingsItem.getMonthsLeft())); 		
	}
	
	
	
}
