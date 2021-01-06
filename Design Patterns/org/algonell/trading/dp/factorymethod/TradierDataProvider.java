package org.algonell.trading.dp.factorymethod;

/**
 * Tradier data provider.
 * Uses REST.
 * 
 * @author Andrew Kreimer
 *
 */
public class TradierDataProvider implements DataProvider {

	@Override
	public String getData() {
		//client requests
		
		return "Data from Tradier";
	}

}
