package net.bounceme.chronos.apptest.services.trading;

import java.math.BigDecimal;

import net.bounceme.chronos.apptest.exceptions.TraderException;
import net.bounceme.chronos.apptest.services.CalculatorService;
import net.bounceme.chronos.utils.spring.BeanUtils;

public class DefaultTrader extends TraderBase  {
	private static final String NAME = "Default";

	public DefaultTrader() {
		super(null, NAME, null);
	}

	public BigDecimal getExchange() throws TraderException {
		CalculatorService calculatorService = (CalculatorService) BeanUtils.getBean(CalculatorService.NAME);
		return calculatorService.getCurrentExchange();
	}

	@Override
	public Boolean getDisabled() {
		return Boolean.FALSE;
	}
}
