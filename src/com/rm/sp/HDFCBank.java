package com.rm.sp;

public class HDFCBank extends RBIBank {
	
	public void branchDetails() {
		
		System.out.println("Name");
		
	}
	public void cardDetails() {
		
		System.out.println("Number");
		
	}
	
	public static void main (String[] args) {
		
		HDFCBank bD = new HDFCBank();
		bD.branchDetails();
		bD.cardDetails();
		bD.aadharDetail();
		bD.panDetails();
		
	}

}
