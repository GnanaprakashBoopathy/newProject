package com.practice;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;

public class PomImplementation extends PomBaseClass {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		PomBaseClass b=new PomBaseClass();
		b.launchBrowser();
		b.url("https://www.facebook.com/");
		PageObjectModelPractice p=new PageObjectModelPractice();
		WebElement userName = p.getUserName();
		b.giveText(userName, b.excelInput(1, 0));
		WebElement password = p.getPassword();
		b.giveText(password, b.excelInput(1, 1));
		WebElement login = p.getLogin();
		b.singleClick(login);
	
	
	
	}

}
