package com.finanz.object;

import java.util.ArrayList;
import java.util.List;

public class FinancePortfolio {

	private final String name;
	private List<AbstractFinanceProduct> portfolio;

	public FinancePortfolio(String name) {
		this.name = name;
		this.portfolio = new ArrayList<AbstractFinanceProduct>();
	}

	public List<AbstractFinanceProduct> getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(List<AbstractFinanceProduct> portfolio) {
		this.portfolio = portfolio;
	}

	public String getName() {
		return name;
	}

}
