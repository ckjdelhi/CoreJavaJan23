package com.oops;

/*
 Overriding:
 	1. To use Overriding, we need two classes
 	2. create inheritance b/w those classes
 	3. for overriding same method should be available in child class
 	4. return type should not change in overriding
 */

class Test{
	void show() {
		System.out.println("show");
	}
}

public class OverridingDemo extends Test{

	public static void main(String[] args) {
		OverridingDemo objDemo = new OverridingDemo();
		objDemo.show();
		objDemo.display();
	}
	
	void display() {
		System.out.println("display");
	}
	
	void show() { //overriding 
		System.out.println("show");
	}
	void show(int a) {//overloading
		System.out.println("show");
	}
}
