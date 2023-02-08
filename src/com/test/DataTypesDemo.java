package com.test;

/*
 * 0 or 1 = 1 bit
 * 8 bit  = 1 byte
 * 1024 byte = 1 KB kilo byte
 * 1024 KB = 1 MB mega byte
 * 1024 MB = 1 GB giga byte
 * 1024 GB = 1 TB tera byte
 * 
 */

//512 MB RAM for JAVA

/*
 * Data types:
 * 1. Primitive data types
 * 2. Non-Primitive data types
 */

//30+30=60 bytes
public class DataTypesDemo {
		//datatype variableName operator value;
	
	boolean c1 = true;  //false
	
	//byte a1=128; //1 byte	
	
	int a = 5; //4 bytes memory
		float b = 5; //4 bytes
		
		double d = 10;//8 bytes
		
		String s ="chandan"; // 7 x 2 = 14 byte
		
	public static void main(String[] args) {
		
		DataTypesDemo obj1= new DataTypesDemo(); //30 bytes of RAM
		DataTypesDemo obj2= new DataTypesDemo(); //30 bytes of RAM
		
		//System.out.println(10 < 5);
		
		long c2 = 50l;
		double c = 50.50d; //8 bytes
		float c1 = 50.50f;
		
		
		char ch= 'a'; //2 bytes
		System.out.println(ch);
		
		char ch1 = 35;
		System.out.println(ch1);
		
		
		for(char i = 65; i<=90;i++) {
			System.out.println(i);
		}
		
		
		String str= "abcde"; //5 x 2 = 10 
		int arr[]= {5, 10, 20, 40}; //4 x4 = 16
		System.out.println(arr.length);
		
	}

}
