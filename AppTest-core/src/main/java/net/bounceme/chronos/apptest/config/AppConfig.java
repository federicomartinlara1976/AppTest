package net.bounceme.chronos.apptest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.bounceme.chronos.apptest.common.Constantes;
import net.bounceme.chronos.apptest.dto.BitcoinCalculatorDTO;
import net.bounceme.chronos.apptest.dto.ExchangeDTO;
import net.bounceme.chronos.utils.mapping.JacksonConverter;

@Configuration
public class AppConfig {

	public static final String BITCOIN_CONVERTER = "bitcoinConverter";
	
	public static final String EXCHANGE_CONVERTER = "exchangeConverter";
	
	@SuppressWarnings({ Constantes.UNCHECKED, Constantes.RAWTYPES })
	@Bean(name = BITCOIN_CONVERTER)
	public JacksonConverter<BitcoinCalculatorDTO> bitcoinConverter() {
		return new JacksonConverter(BitcoinCalculatorDTO.class);
	}
	
	@SuppressWarnings({ Constantes.UNCHECKED, Constantes.RAWTYPES })
	@Bean(name = EXCHANGE_CONVERTER)
	public JacksonConverter<ExchangeDTO> exchangeConverter() {
		return new JacksonConverter(ExchangeDTO.class);
	}
}
