package com.oops;

class Calculator {
	void add(int a, int b) {
		System.out.println("P: "+(a + b));
	}
}


public class OverlodingDemo2 extends Calculator{

	public static void main(String[] args) {
		OverlodingDemo2 obj=new OverlodingDemo2();
		obj.add(20, 30);
		obj.add(30, 10, 20);
	}
	
	void add(int a, int b) {
		System.out.println("C:"+(a + b));
	}
	
	void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	
	void sub(int a, int b) {
		System.out.println(a - b);
	}
	

}
