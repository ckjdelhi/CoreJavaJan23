package com.test;

/**
 * Type of Variables
 * 1. Local: any variable available within the method is called as local variable
 * 2. static: it should be declared with static keyword and it should be ouside of method
 * 3. instance: any variable declared ouside of method without static 
 */
public class VariablesDemo {

	
	static int c=5; //static or class
	
	int d=5;//instance or object
	
	public static void main(String[] args) {
//		int a=5;//local
//		System.out.println(a);
		
		VariablesDemo obj1=new VariablesDemo();
		obj1.c = 10;
		obj1.d = 10;
		VariablesDemo obj2=new VariablesDemo();
		obj2.c= 50;
		obj2.d = 20;
		
		
		System.out.println("Obj1= "+ obj1.c+" " +obj1.d);
		System.out.println("Obj2= "+ obj2.c+" " +obj2.d);
		
		
		
		
	}
	
	void show() {
		int b=5;//local
		System.out.println(b);
		
		System.out.println(c);
		System.out.println(d);
	}
	
	

}
