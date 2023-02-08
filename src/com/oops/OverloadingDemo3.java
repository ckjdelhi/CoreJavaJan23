package com.oops;

public class OverloadingDemo3 {

	public static void main(String[] args) {
		OverloadingDemo3 obj= new OverloadingDemo3();
		obj.show(10, 10);
		obj.show(20, 10L);
	}
	
	
	void show(int a, long b) {
		System.out.println("int , long");
	}
	

	void show(int a, int b) {
		System.out.println("int, int");
	}

}
