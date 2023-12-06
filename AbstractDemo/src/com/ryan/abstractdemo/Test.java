package com.ryan.abstractdemo;

public class Test {

	public static void main(String[] args) {
//		Payment payment = new Payment();

		CashPayment laptop = new CashPayment(1500);
		
		laptop.paymentDetails();
		
		CreditCardPayment tacos = new CreditCardPayment(50, "CreditCardStringSample", "Robert s", "02/99");
		tacos.paymentDetails();
	}

}
