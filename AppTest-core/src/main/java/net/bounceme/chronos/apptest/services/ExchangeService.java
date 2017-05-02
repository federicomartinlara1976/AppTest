package net.bounceme.chronos.apptest.services;

import java.math.BigDecimal;

import net.bounceme.chronos.apptest.common.Constantes.ExchangeTypes;
import net.bounceme.chronos.apptest.exceptions.ServiceException;

public interface ExchangeService {
	static final String NAME = "exchangeService";

	BigDecimal changeCurrency(BigDecimal sCurrency, ExchangeTypes base, ExchangeTypes symbol) throws ServiceException;
}