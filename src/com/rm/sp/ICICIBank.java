package com.rm.sp;

public class ICICIBank extends RBIBank {
	
	public void branchName() {
		
		System.out.println("Adayar");
		
	}
	
	public void passBook() {
		
		System.out.println ("Number");
		
		
	}
	public static void main(String[] args) {
		
		ICICIBank bankDetails = new ICICIBank();
		bankDetails.passBook();
		bankDetails.branchName();
		bankDetails.aadharDetail();
		bankDetails.panDetails();
		
		
	}

}
