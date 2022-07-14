package com.adactin;

import java.util.List;

import org.junit.runner.FilterFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.annotations.GwtIncompatible;

public class AdactinPom extends AdactinBassClass {
	public AdactinPom() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement txtUsername;
	
	@FindBy(id="password")
	private WebElement txtPassword;
	
	@FindBy(id="login")
	private WebElement btnLogin;
	
	@FindBy(xpath="//select[@name=\"location\"]")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement noOfRoom;
	
	@FindBy(id="datepick_in")
	private WebElement ciDate;
	
	@FindBy(id="datepick_out")
	private WebElement coDate;
	
	@FindBy(id="adult_room")
	private WebElement noOfAdults;
	
	@FindBy(id="child_room")
	private WebElement noOfChild;
	
	@FindBy(id="Submit")
	private WebElement btnSubmit;
	
	@FindBy(xpath="//input[@id=\"radiobutton_0\"]")
	private WebElement selectOption;
	
	public WebElement getSelectOption() {
		return selectOption;
	}

	public void setSelectOption(WebElement selectOption) {
		this.selectOption = selectOption;
	}

	public WebElement getContinue1() {
		return continue1;
	}

	public void setContinue1(WebElement continue1) {
		this.continue1 = continue1;
	}

	@FindBy(id="continue")
	private WebElement continue1;
	
	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement bAddress;
	
	@FindBy(id="cc_num")
	private WebElement cCardNo;
	
	@FindBy(id="cc_type")
	private WebElement cCardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement cCardMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement cCardYear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvNo;
	
	@FindBy(id="book_now")
	private WebElement btnBookNow;
	
	@FindBy(id="my_itinerary")
	private WebElement btnitinerary;
	
	@FindBy(xpath="//input[contains(@name,\"order_id_\")][@onkeypress=\"return Nothingonly(event)\"]")
	private List<WebElement> orderId;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public WebElement getBtnitinerary() {
		return btnitinerary;
	}

	public void setBtnitinerary(WebElement btnitinerary) {
		this.btnitinerary = btnitinerary;
	}

	public  List<WebElement> getOrderId() {
		return orderId;
	}

	public void setOrderId(WebElement orderId) {
		this.orderId = (List<WebElement>) orderId;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}

	public WebElement getbAddress() {
		return bAddress;
	}

	public void setbAddress(WebElement bAddress) {
		this.bAddress = bAddress;
	}

	public WebElement getcCardNo() {
		return cCardNo;
	}

	public void setcCardNo(WebElement cCardNo) {
		this.cCardNo = cCardNo;
	}

	public WebElement getcCardType() {
		return cCardType;
	}

	public void setcCardType(WebElement cCardType) {
		this.cCardType = cCardType;
	}

	public WebElement getcCardMonth() {
		return cCardMonth;
	}

	public void setcCardMonth(WebElement cCardMonth) {
		this.cCardMonth = cCardMonth;
	}

	public WebElement getcCardYear() {
		return cCardYear;
	}

	public void setcCardYear(WebElement cCardYear) {
		this.cCardYear = cCardYear;
	}

	public WebElement getCvvNo() {
		return cvvNo;
	}

	public void setCvvNo(WebElement cvvNo) {
		this.cvvNo = cvvNo;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

	public void setBtnBookNow(WebElement btnBookNow) {
		this.btnBookNow = btnBookNow;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public void setRoomType(WebElement roomType) {
		this.roomType = roomType;
	}

	public WebElement getNoOfRoom() {
		return noOfRoom;
	}

	public void setNoOfRoom(WebElement noOfRoom) {
		this.noOfRoom = noOfRoom;
	}

	public WebElement getCiDate() {
		return ciDate;
	}

	public void setCiDate(WebElement ciDate) {
		this.ciDate = ciDate;
	}

	public WebElement getCoDate() {
		return coDate;
	}

	public void setCoDate(WebElement coDate) {
		this.coDate = coDate;
	}

	public WebElement getNoOfAdults() {
		return noOfAdults;
	}

	public void setNoOfAdults(WebElement noOfAdults) {
		this.noOfAdults = noOfAdults;
	}

	public WebElement getNoOfChild() {
		return noOfChild;
	}

	public void setNoOfChild(WebElement noOfChild) {
		this.noOfChild = noOfChild;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public void setBtnSubmit(WebElement btnSubmit) {
		this.btnSubmit = btnSubmit;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public void setHotel(WebElement hotel) {
		this.hotel = hotel;
	}

	public WebElement getLocation() {
		return location;
	}

	public void setLocation(WebElement location) {
		this.location = location;
	}

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public void setTxtUsername(WebElement txtUsername) {
		this.txtUsername = txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public void setTxtPassword(WebElement txtPassword) {
		this.txtPassword = txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(WebElement btnLogin) {
		this.btnLogin = btnLogin;
	}
	
	
	
	
	
	

}
