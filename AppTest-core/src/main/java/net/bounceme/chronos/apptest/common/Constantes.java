package net.bounceme.chronos.apptest.common;

import java.math.BigDecimal;
import java.util.Locale;

import net.bounceme.chronos.apptest.services.trading.BitStampTrader;
import net.bounceme.chronos.apptest.services.trading.DefaultTrader;
import net.bounceme.chronos.apptest.services.trading.MtGoxTrader;
import net.bounceme.chronos.apptest.services.trading.Plus500Trader;

public class Constantes extends net.bounceme.chronos.utils.common.Constantes {

	public static enum ExchangeTypes {
		USD, EUR
	}
	
	public static enum Locales {
		es(Locale.getDefault()), en(Locale.ENGLISH), fr(Locale.FRANCE);
		
		private Locale locale;
		
		private Locales(Locale locale) {
			this.locale = locale;
		}
		
		public Locale value() {
			return locale;
		}
	}
	
	public static enum HashRates {
		MH(1000L), GH(1000000L), TH(1000000000L);

		private Long multiply;

		private HashRates(Long multiply) {
			this.multiply = multiply;
		}

		public Long getMultiply() {
			return multiply;
		}
	}
	
	public static enum Traders {
		Default(DefaultTrader.class), BitStamp(BitStampTrader.class), MtGox(MtGoxTrader.class),Plus500(Plus500Trader.class);
		
		private Class<?> traderClass;
		
		private Traders(Class<?> traderClass) {
			this.traderClass = traderClass;
		}
		
		public Class<?> getTraderClass() {
			return traderClass;
		}
	}
	
	public static final String INITIAL_HASHRATE = "1";
	
	public static final BigDecimal DAY_TIME_FACTOR = new BigDecimal(24);
	
	public static final BigDecimal WEEK_TIME_FACTOR = new BigDecimal(7);
	
	public static final BigDecimal AVERAGE_MONTH_TIME_FACTOR = new BigDecimal(30.4);
	
	public static final BigDecimal DOLLAR_MULTIPLY_FACTOR = new BigDecimal(1000);
	
	public static final String ENCODING_EXPORTS = "ISO-8859-1";
}
