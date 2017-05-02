package net.bounceme.chronos.apptest.model;

import org.apache.commons.lang3.StringUtils;

import net.bounceme.chronos.utils.jsf.model.login.Login;

public class LoginModel implements Login {

	private String user;
	private String password;
	
	@Override
	public String getUser() {
		return user;
	}

	@Override
	public void setUser(String user) {
		this.user = user;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String login() {
		return StringUtils.EMPTY;
	}

}
