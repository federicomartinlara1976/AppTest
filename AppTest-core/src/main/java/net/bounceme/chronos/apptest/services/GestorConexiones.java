package net.bounceme.chronos.apptest.services;

import java.util.Map;

import net.bounceme.chronos.apptest.exceptions.ServiceException;

public interface GestorConexiones {
	public static String NAME = "gestorConexiones";
	
	String getData(Map<String, String> parameters) throws ServiceException;
}
