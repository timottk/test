package com.finanz.main;

import java.util.GregorianCalendar;

import com.finanz.calculator.FinanceCalculator;
import com.finanz.gui.MainEntry;
import com.finanz.object.FinanceDeposit;

public class MainStart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MainEntry mainEntry = new MainEntry();

		FinanceCalculator calculator = new FinanceCalculator("Timo Depot");
		FinanceDeposit deposit = new FinanceDeposit(100000, 3, new GregorianCalendar(2014, 1, 1), new GregorianCalendar(2016,1,1));

		calculator.addFinanceProduct(deposit);
		double result = calculator.calculateMoney();

		System.out.println("Your money has been raised to:" + result);


	}

}
