package com.finanz.object;

import java.util.Date;
import java.util.GregorianCalendar;

public abstract class AbstractFinanceProduct {

	private double amount;
	private double rate;
	private GregorianCalendar startDate;
	private GregorianCalendar endDate;

	public AbstractFinanceProduct(double amount, double rate, GregorianCalendar startDate, GregorianCalendar endDate) {
		this.amount = amount;
		this.rate = rate;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public double getAmount() {
		return amount;
	}

	public double getRate() {
		return rate;
	}

	public GregorianCalendar getStartDate() {
		return startDate;
	}

	public GregorianCalendar getEndDate() {
		return endDate;
	}

	public abstract double calculateProduct();

	public abstract String getProductName();

}
