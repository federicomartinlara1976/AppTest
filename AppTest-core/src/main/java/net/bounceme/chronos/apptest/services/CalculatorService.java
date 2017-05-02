package net.bounceme.chronos.apptest.services;

import java.math.BigDecimal;
import java.util.List;

import net.bounceme.chronos.apptest.common.Constantes.Traders;
import net.bounceme.chronos.apptest.dto.BitcoinCalculatorDTO;
import net.bounceme.chronos.apptest.exceptions.ServiceException;
import net.bounceme.chronos.apptest.services.trading.Trader;

public interface CalculatorService {
	static final String NAME = "calculatorService";
	
	Double getCurrentDifficultyFactor();
	
	Double getNextDifficultyFactor();
	
	BigDecimal getCurrentExchange();
	
	BigDecimal getExchange(Trader trader) throws ServiceException;
	
	List<Trader> getTraders() throws ServiceException;
	
	Trader getTrader(Traders traders) throws ServiceException;
	
	BigDecimal getCurrentBcPerBlock();
	
	String getCurrentExchangeRateSource();
	
	BitcoinCalculatorDTO getData(Long hashRate, BigDecimal exchangeAmount) throws ServiceException;
}
