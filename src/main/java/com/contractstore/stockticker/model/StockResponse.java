package com.contractstore.stockticker.model;

import java.util.Collection;

public class StockResponse {
	
	private Collection<String> stocks;

	public Collection<String> getStocks() {
		return stocks;
	}

	public void setStocks(Collection<String> stocks) {
		this.stocks = stocks;
	}

}
