package com.rm.sp;

public class Chennai extends Madras {
	
	public void marinaBeach() {
		
		System.out.println("Beach road");
		}
    public void parrysCorner() {
    	
    	System.out.println("Beach Station");
    }
    public void ispahaniCenter() {
    	
    	System.out.println("Nungambakkam");
    	
    }
    public static void main (String[] args) {
    	
    	Chennai north = new Chennai ();
    	north.marinaBeach();
    	north.parrysCorner();
    	north.ispahaniCenter();
    	north.phoenixMall();
    	north.coalBarbeque();
    	
    	
    }
}
