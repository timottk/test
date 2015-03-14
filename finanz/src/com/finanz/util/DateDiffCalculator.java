package com.finanz.util;

import java.util.GregorianCalendar;

public class DateDiffCalculator {

	public static int daysBetween(GregorianCalendar startDate, GregorianCalendar endDate) {
		int days = 0;
		if(startDate != null && endDate !=  null) {
			long difference = startDate.getTimeInMillis() - endDate.getTimeInMillis();
			days = (int)(difference / (1000 * 60 * 60 * 24));
		}
		return days;
	}
}
