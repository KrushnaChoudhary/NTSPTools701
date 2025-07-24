package com.nt.upi;

public class UPIPaymentOperations {

	//Payment feature
	public String doPayment(long phoNo,double amount) {  
		return amount+"amount is paid to @phone number::"+phoNo; 
	}
}
