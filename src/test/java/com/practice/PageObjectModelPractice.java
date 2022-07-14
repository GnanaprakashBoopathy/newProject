package com.practice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageObjectModelPractice extends PomBaseClass {
	public PageObjectModelPractice() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement userName;
	@FindBy(name="pass")
	private WebElement password;
	@FindBy(xpath="//button[@name=\"login\"]")
	private WebElement login;
	public WebElement getUserName() {
		return userName;
	}
	public void setUserName(WebElement userName) {
		this.userName = userName;
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public WebElement getLogin() {
		return login;
	}
	public void setLogin(WebElement login) {
		this.login = login;
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	


