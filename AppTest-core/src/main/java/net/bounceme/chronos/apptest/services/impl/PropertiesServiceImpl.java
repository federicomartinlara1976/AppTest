package net.bounceme.chronos.apptest.services.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import net.bounceme.chronos.apptest.services.PropertiesService;
import net.bounceme.chronos.apptest.utils.BitcoinCalculatorProperties;

/**
 * @author frederik
 *
 */
@Service(PropertiesService.NAME)
@Scope("singleton")
public class PropertiesServiceImpl implements PropertiesService {

	@Override
	public String getProperty(String name) {
		return BitcoinCalculatorProperties.getInstance().getString(name);
	}

}
