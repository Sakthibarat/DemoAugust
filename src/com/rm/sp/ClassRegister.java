package com.rm.sp;

public class ClassRegister {
	
	public void attendance (int id) {
		
		System.out.println(id);
		
	}
	public void attendance (String name) {
		
		System.out.println(name);
		
	}
	public void attendance (String sub,int marks) {
		
		System.out.println(sub);
		System.out.println(marks);
		
	}
	
	public static void main (String[] args) {
		
		ClassRegister c = new ClassRegister();
		c.attendance("Barat");
		c.attendance("Maths", 70);
		
	}

}
