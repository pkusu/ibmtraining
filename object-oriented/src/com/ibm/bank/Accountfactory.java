package com.ibm.bank;

public class Accountfactory {
	public Bank openAccount(String holder, String acType) {
		bank acnt = null;
		
		if(acType.equals("Savings"))
			acnt = new Savings(holder);
		else
			acnt = new Current(holder);
		
		return acnt;
				
		
	}
}
