package com.xworkz.atmapp;

public class BankTester {

	public static void main(String a[]) {
	//Abstraction
	/*Atm atm= BankFactory.getAmount("sbiMoney");
	if(atm!=null) {
		atm.accessCard();
	}*/

	Atm atm= new KarAtmImp() ;
	
		atm.accessCard();
	
	Atm atm5=new SbiAtmImp();
	atm5.accessCard();

	Atm atm6= new SynAtmImp();
	atm6.accessCard();
	}
}