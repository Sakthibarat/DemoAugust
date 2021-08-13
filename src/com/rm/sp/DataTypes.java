package com.rm.sp;

public class DataTypes {
	
	public int addition () {
		
		int i = 7;
		int j = 7;
		int k = i+j;
		System.out.println(k);
		return k;
		
	}
	
	public int subtraction () {
		
		int a = 10;
		int b = 20;
		int c = b-a;
		System.out.println(c);
		return c;
		
	}
	
	public static void main (String[] args) {
		
		DataTypes type = new DataTypes();
		int s = type.addition();
		int g = type.subtraction();
		System.out.println(s+g);
		
		
	}

}
