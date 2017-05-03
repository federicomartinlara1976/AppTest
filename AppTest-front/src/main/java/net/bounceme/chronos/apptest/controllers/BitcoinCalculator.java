package net.bounceme.chronos.apptest.controllers;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import net.bounceme.chronos.apptest.model.LoginModel;
import net.bounceme.chronos.apptest.services.CalculatorService;
import net.bounceme.chronos.apptest.services.ExchangeService;
import net.bounceme.chronos.utils.jsf.controller.BaseBean;
import net.bounceme.chronos.utils.jsf.model.iban.Iban;
import net.bounceme.chronos.utils.log.Log;
import net.bounceme.chronos.utils.log.LogFactory;

@ManagedBean(name = BitcoinCalculator.NAME)
@ViewScoped
public class BitcoinCalculator extends BaseBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 354285024366651540L;

	public static final String NAME = "bitcoinCalculator";

	private static final Log LOGGER = LogFactory.getInstance().getLog(BitcoinCalculator.class);

	@ManagedProperty(value = "#{sessionBean}")
	private SessionBean sessionBean;

	@Autowired
	@Qualifier(CalculatorService.NAME)
	private CalculatorService calculatorService;

	@Autowired
	@Qualifier(ExchangeService.NAME)
	private ExchangeService exchangeService;
	
	private Iban iban;
	
	private LoginModel loginModel; 
	
	private Date date;

	public BitcoinCalculator() {
		loginModel = new LoginModel();
	}

	@PostConstruct
	public void init() {
		initVars();
	}

	public void setSessionBean(SessionBean sessionBean) {
		this.sessionBean = sessionBean;
	}

	public void reset(ActionEvent actionEvent) {
		initVars();
	}

	/**
	 * 
	 */
	private void initVars() {
		
	}

	/**
	 * @return the iban
	 */
	public Iban getIban() {
		return iban;
	}

	/**
	 * @param iban the iban to set
	 */
	public void setIban(Iban iban) {
		this.iban = iban;
	}

	/**
	 * @return the loginModel
	 */
	public LoginModel getLoginModel() {
		return loginModel;
	}

	/**
	 * @param loginModel the loginModel to set
	 */
	public void setLoginModel(LoginModel loginModel) {
		this.loginModel = loginModel;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
}
