package com.finanz.object;

import java.util.GregorianCalendar;

public class FinanceFond extends AbstractFinanceProduct{

	private final String PRODUCT_FOND = "Fond";

	public FinanceFond(double amount, double rate, GregorianCalendar startDate, GregorianCalendar endDate) {
		super(amount, rate, startDate, endDate);
	}

	@Override
	public String getProductName() {
		return PRODUCT_FOND;
	}

	@Override
	public double calculateProduct() {
		// TODO Auto-generated method stub
		return 0;
	}
}
