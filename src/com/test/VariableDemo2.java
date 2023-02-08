package com.test;

public class VariableDemo2 {


	static String country="In";
	String name="chandan"; //instance 
	
	public static void main(String[] args) {
		
		VariableDemo2 obj = new VariableDemo2();
		System.out.println(obj.name);
		
		CommentDemo obj2= new CommentDemo();
		System.out.println(obj2.age);
		
		
		
		System.out.println(country);
		
		
		boolean b = true;
		if(b == true) {
			System.out.println("Hi");
		}
		
        byte a = 127; // -128 to 127
        System.out.println(a);
        a++;
        System.out.println(a);
        a++;
        System.out.println(a);
		
        
        int d =17;
        int e= 6;
        double res= d/(double)e; //floating number
        System.out.println(res);
	}

}
