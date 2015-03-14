
package com.finanz.calculator;

import java.util.List;

import com.finanz.object.AbstractFinanceProduct;
import com.finanz.object.FinancePortfolio;

public class FinanceCalculator {

	private FinancePortfolio portfolio;

	public FinanceCalculator(String name) {
		this.portfolio = new FinancePortfolio(name);
	}

	public void addFinanceProduct(AbstractFinanceProduct product) {
		if(this.portfolio != null) {
			List<AbstractFinanceProduct> currentPortfolio = this.portfolio.getPortfolio();
			if(currentPortfolio != null) {
				currentPortfolio.add(product);
			}
		}
	}

	public double calculateMoney() {
		double result = 0;
		List<AbstractFinanceProduct> currentPortfolio = this.portfolio.getPortfolio();
		if(currentPortfolio != null) {
			for (AbstractFinanceProduct product : currentPortfolio) {
				result = result + product.calculateProduct();
			}
		}
		return result;
	}


}
