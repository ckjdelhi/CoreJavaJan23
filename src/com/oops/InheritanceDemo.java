package com.oops;

class GrandParent {
	void print() {
		System.out.println("print");
	}
}

class Parent extends GrandParent{
	void show() {
		System.out.println("show");
	}
}

class Child extends Parent{
	void display() {
		System.out.println("display");
	}
}
class Child2 extends Parent {
	
}


public class InheritanceDemo {

	public static void main(String[] args) {
		
		Parent obj=new Parent();
		obj.show();
		obj.print();
		
		Child obj2=new Child();
		obj2.display();
		obj2.show();
		obj2.print();
		
		Child2 obj3=new Child2();
		//obj3.display();
		obj3.show();
		obj3.print();

	}

}
