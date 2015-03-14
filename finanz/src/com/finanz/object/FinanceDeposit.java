package com.finanz.object;

import java.util.GregorianCalendar;

import com.finanz.util.DateDiffCalculator;


public class FinanceDeposit extends AbstractFinanceProduct {

	private static final String PRODUCT_DEPOSIT = "Deposit";
	private static final double BANK_YEAR = 365;


	public FinanceDeposit(double amount, double rate, GregorianCalendar startDate, GregorianCalendar endDate) {
		super(amount, rate, startDate, endDate);
	}

	@Override
	public String getProductName() {
		return PRODUCT_DEPOSIT;
	}

	@Override
	public double calculateProduct() {
		double result = 0;
		double n = getPeriod() / BANK_YEAR;
		result = getAmount() * Math.pow((this.getRate() / 100) + 1, n);
		return result;
	}

	private int getPeriod() {
		GregorianCalendar startDate = getStartDate();
		GregorianCalendar endDate = getEndDate();
		int days = DateDiffCalculator.daysBetween(endDate, startDate);
		return days;
	}
}
