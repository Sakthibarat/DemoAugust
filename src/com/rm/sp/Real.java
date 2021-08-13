package com.rm.sp;

import java.util.ArrayList;
import java.util.List;


public class Real {
	
	public static void main(String[] args) {
		
		
		List<Integer> ba = new ArrayList();
		ba.add(12);
		ba.add(13);
		ba.add(6);
		
		System.out.println(ba);
		
		ba.set(0, 6);
		ba.set(2, 15);
		
		System.out.println(ba);
	}

}
