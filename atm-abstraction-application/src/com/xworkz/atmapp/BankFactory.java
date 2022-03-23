package com.xworkz.atmapp;

public class BankFactory {

	public static Atm getAmount(String BankName) {
		if(BankName.equalsIgnoreCase("sbiMoney")) {
			return new SbiAtmImp();
		}
		else if(BankName.equalsIgnoreCase("karmoney")) {
			return new KarAtmImp();
		}
		else if(BankName.equalsIgnoreCase("synMoney")){
			return new SynAtmImp();
		}
	
		return null;
	}
	
}
