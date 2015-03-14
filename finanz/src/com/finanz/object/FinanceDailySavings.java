package com.finanz.object;

import java.util.GregorianCalendar;

public class FinanceDailySavings extends AbstractFinanceProduct {

	public FinanceDailySavings(double amount, double rate, GregorianCalendar startDate, GregorianCalendar endDate) {
		super(amount, rate, startDate, endDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateProduct() {
		
		return 0;
	}

	@Override
	public String getProductName() {
		return null;
	}

}
