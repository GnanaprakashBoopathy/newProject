package com.adactin;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;

public class AdactinImplementation extends AdactinBassClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		AdactinBassClass b=new AdactinBassClass();
		b.launchBrowser();
		b.url("https://adactinhotelapp.com/index.php");
		
		AdactinPom p=new AdactinPom();
		WebElement txtUsername = p.getTxtUsername();
		b.giveText(txtUsername, b.excelText(9, 0));
		WebElement txtPassword = p.getTxtPassword();
		b.giveText(txtPassword, b.excelText(9, 1));
		WebElement btnLogin = p.getBtnLogin();
		b.singleClick(btnLogin);
		b.pause(3000);
		WebElement location = p.getLocation();
		b.dragDrop(location, 3);
		WebElement hotel = p.getHotel();
		b.dragDrop(hotel, 2);
		WebElement roomType = p.getRoomType();
		b.dragDrop(roomType, 3);
		WebElement noOfRoom = p.getNoOfRoom();
		b.dragDrop(noOfRoom, 1);
		WebElement ciDate = p.getCiDate();
		b.textClear(ciDate);
		b.giveText(ciDate, "10/07/2022");
		WebElement coDate = p.getCoDate();
		b.textClear(coDate);
		b.giveText(coDate, "11/07/2022");
		WebElement noOfAdults = p.getNoOfAdults();
		b.dragDrop(noOfAdults, 2);
		WebElement noOfChild = p.getNoOfChild();
		b.dragDrop(noOfChild, 1);
		WebElement btnSubmit = p.getBtnSubmit();
		b.singleClick(btnSubmit);
		WebElement selectOption = p.getSelectOption();
		b.singleClick(selectOption);
		WebElement continue1 = p.getContinue1();
		b.singleClick(continue1);
		WebElement firstName = p.getFirstName();
		b.giveText(firstName, b.excelText(10, 1));
		WebElement lastName = p.getLastName();
		b.giveText(lastName, b.excelText(11, 1));
		WebElement getbAddress = p.getbAddress();
		b.giveText(getbAddress, b.excelText(12, 1));
		WebElement getcCardNo = p.getcCardNo();
		b.giveText(getcCardNo, b.excelText(13, 1));
		WebElement getcCardType = p.getcCardType();
		b.dragDrop(getcCardType, 2);
		WebElement getcCardMonth = p.getcCardMonth();
		b.dragDrop(getcCardMonth, 3);
		WebElement getcCardYear = p.getcCardYear();
		b.dragDrop(getcCardYear, 6);
		WebElement cvvNo = p.getCvvNo();
		b.giveText(cvvNo, b.excelText(14, 1));
		WebElement btnBookNow = p.getBtnBookNow();
		b.singleClick(btnBookNow);
		b.imPause(15);
		WebElement btnitinerary = p.getBtnitinerary();
		b.singleClick(btnitinerary);
//		WebElement orderId = p.getOrderId();
//		String attri = b.getAttri(orderId);
//		b.printText(attri);
		
		List<WebElement> order = p.getOrderId();
		for (WebElement ord : order) {
		String attri2 = b.getAttri(ord);	
		b.printText(attri2);
		b.excelWrite("order id", attri2);
		}
		
		
		
		
		
	
	
	
	
	
	
	}
	
	}
