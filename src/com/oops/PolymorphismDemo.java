package com.oops;

/*
 * Polymorphism(having many form)
  1. Overloading
 	* method name should be same with different parameters
 	* return type doesn't matter
 	* if number of parameter is same then change the data type
 
  2. Overriding
 */
public class PolymorphismDemo {

	public static void main(String[] args) {
		PolymorphismDemo obj = new PolymorphismDemo();
		obj.insert("chandan", "kumar");
		obj.insert("chandan", "kumar", "India");
		obj.insert("chandan", "kumar", "India", "20102");
		obj.insert("Chandan", 5000);
		
		System.out.println();
		System.out.println("Chandan");
		System.out.println(5000);
		
	}


	private void insert(String string, String string2, String string3, String string4) {
		
	}

	private void insert(String string, String string2, String string3) {
		
	}

	private void insert(String string, String string2) {
		
	}
	private void insert(String a, int b) {
		
	}
	

}
