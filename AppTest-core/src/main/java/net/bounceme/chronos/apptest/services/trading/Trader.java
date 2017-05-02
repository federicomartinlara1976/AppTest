package net.bounceme.chronos.apptest.services.trading;

import java.math.BigDecimal;

import net.bounceme.chronos.apptest.exceptions.TraderException;

public interface Trader {
	String getName();
	
	String getUrl();
	
	String getIcon();
	
	Boolean getDisabled();
	
	/**
	 * En dólares por defecto
	 * 
	 * @return
	 * @throws TraderException
	 */
	BigDecimal getExchange() throws TraderException;
}
