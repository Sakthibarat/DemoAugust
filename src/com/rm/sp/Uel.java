package com.rm.sp;

public class Uel extends Ucl {
	
	
	
	@Override
	public void country() {
		System.out.println("England");
		
	}
	
	@Override
	public void continent() {
		System.out.println("America");
		
	}
	
	public static void main (String [] args) {
		
		Uel e = new Uel();
		e.teamName();
		e.continent();
		e.country();
		
	}

}
