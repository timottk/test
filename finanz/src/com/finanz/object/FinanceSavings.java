package com.finanz.object;

import java.util.GregorianCalendar;

public class FinanceSavings extends AbstractFinanceProduct{

	private final String PRODUCT_SAVING = "Saving";

	public FinanceSavings(double amount, double rate, GregorianCalendar startDate, GregorianCalendar endDate) {
		super(amount, rate, startDate, endDate);
	}

	@Override
	public String getProductName() {
		return PRODUCT_SAVING;
	}

	@Override
	public double calculateProduct() {
		// TODO Auto-generated method stub
		return 0;
	}
}
