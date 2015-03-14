package com.finanz.object;

import java.util.GregorianCalendar;

public class FinanceShare extends AbstractFinanceProduct {

	private final String PRODUCT_SHARE = "Share";

	public FinanceShare(double amount, double rate, GregorianCalendar startDate, GregorianCalendar endDate) {
		super(amount, rate, startDate, endDate);
	}

	@Override
	public String getProductName() {
		return PRODUCT_SHARE;
	}

	@Override
	public double calculateProduct() {
		// TODO Auto-generated method stub
		return 0;
	}



}
