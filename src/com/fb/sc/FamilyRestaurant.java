package com.fb.sc;

import com.rm.sp.*;

public class FamilyRestaurant {
	
	public void glassPlates() {
		
		System.out.println ("Handle it with care");
	}
	
	public void couch() {
		
		System.out.println ("four seater");
		
	}
	
	public void waterBottle() {
		
		System.out.println ("Use if needed");
		
	}
	public static void main (String[] args) {
		FamilyRestaurant accessories = new FamilyRestaurant ();
		accessories.glassPlates();
		accessories.couch();
		accessories.waterBottle();
		RestoBar rate = new RestoBar();
		rate.redWine();
		rate.redBull();
		
	}

}
