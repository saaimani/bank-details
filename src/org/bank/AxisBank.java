package org.bank;

public class AxisBank extends BankInfo{

	public  void deposit() {
		System.out.println("2000");
	}
	public static void main(String[]args) {
		AxisBank a=new AxisBank();
		a.deposit();
		a.saving();
		a.fixed();
		
	}
}
