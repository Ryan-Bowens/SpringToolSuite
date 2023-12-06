package com.ryan.abstractdemo;

public class CreditCardPayment extends Payment{
	
	private String cardNum, ownerName, expDate;
//	can do cardNum, ownerName, etc. because they are all Strings

	public CreditCardPayment(double amount, String cardNum, String ownerName, String expDate) {
		super(amount);
		this.cardNum = cardNum;
		this.ownerName = ownerName;
		this.expDate = expDate;
	}
	
	@Override
	public void paymentDetails() {
		super.paymentDetails();
		System.out.println("CardNumber: " + this.cardNum);
		System.out.println("Owner: " + this.ownerName);
		System.out.println("Exp Date: " + this.expDate);
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}



}
