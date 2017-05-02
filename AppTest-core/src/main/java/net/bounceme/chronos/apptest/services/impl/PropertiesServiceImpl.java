package net.bounceme.chronos.apptest.services.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import net.bounceme.chronos.apptest.services.PropertiesService;
import net.bounceme.chronos.apptest.utils.AppTestProperties;

/**
 * @author frederik
 *
 */
@Service(PropertiesService.NAME)
@Scope("singleton")
public class PropertiesServiceImpl implements PropertiesService {

	@Override
	public String getProperty(String name) {
		return AppTestProperties.getInstance().getString(name);
	}

}
