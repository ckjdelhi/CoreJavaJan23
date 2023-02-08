package com.oops;

/*
 * Abstraction:provide easer form to the system and hide the implementation
 * 1. Abstract class (0 to 100% abstraction)
 * 2. Interface(100% abstraction)
 */

/*
 * Abstract class:
 * 1. add abstract keyword to class to make it abstract class
 * 2. You can't create object of abstract class
 * 3. Always extend the abstract class to use it.
 * 4. in abstract class we can have abstract method and non-abstract method (concrete method) as well.
 * 5. Abstract methods do not specify a body
 * 6. Abstract methods must be overridden by child class
 */
//50%
abstract class Testing{
	//concrete method
	void show() {
		System.out.println("show");
	}
	
	abstract void display();
	
	abstract void update();
	
	void check() {
		System.out.println("check");
	}
	
}

/*
 * Interface: 100% abstraction
 * 1. create interface with interface keyword without class keyword
 * 2. by default all methods are public and abstract
 * 3. You can't create object of Interface
 * 4. Always 'implements' the interface to use it.
 */
interface iTesting {
	void insert(); //-> public abstract void insert();
	int delete(); // -> public abstract int delete();
}

public class AbstractionDemo extends Testing implements iTesting{

	public static void main(String[] args) {
		
		//Testing obj = new Testing();
		//obj.show();
		
		AbstractionDemo obj=new AbstractionDemo();
		obj.show();
		obj.display();
		obj.insert();
		obj.delete();
	}

	@Override
	void display() {
		System.out.println("display");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void update() {
		// TODO Auto-generated method stub
		
	}

}
