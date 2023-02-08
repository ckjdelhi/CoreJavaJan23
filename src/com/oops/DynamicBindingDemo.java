package com.oops;

import com.test.CommentDemo;

class BaseClass{
	void show() {
		System.out.println("base class show");
	}
}

class ExtendedClass extends BaseClass {
	void display() {
		System.out.println("extended class display");
	}
	void show() {
		System.out.println("extended class show");
	}
	
}

public class DynamicBindingDemo extends Testing {

	public static void main(String[] args) {
		CommentDemo obj= new CommentDemo();
		
		ExtendedClass o1 = new ExtendedClass();
		o1.display();
		o1.show();
		
		
		BaseClass o2 = new ExtendedClass();//runtime binding
		o2.show();
		//o2.display();
		
		
		
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void update() {
		// TODO Auto-generated method stub
		
	}

}
