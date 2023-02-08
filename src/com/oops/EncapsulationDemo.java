package com.oops;

/*
 Encapsulation:
 1. using {}
 2. access modifiers
 	1. public: accessible within same class, outside of class and anywhere within the project
 	2. private: accessible within same class
 	3. protected: accessible within same class, within the same package and outside of package using inheritance
 	4. default: accessible within same class, outside of class but within the same package
 3. POJO/model class(Plain old java object)
 */

public class EncapsulationDemo {
	
	
	       int aDef = 5;//default
	public int bPub=5; //public
	private int cPriv=5; //private
	protected int dPro=5; //protected

	public static void main(String[] args) {
		
		EncapsulationDemo obj=new EncapsulationDemo();
		System.out.println(obj.aDef);
		System.out.println(obj.bPub);
		System.out.println(obj.cPriv);
		System.out.println(obj.dPro);
		
		
		Student s1=new Student();
		s1.setRollNo(100);
		s1.setName("Chandan");
		s1.setCourse("Java");
		
		Student s2=new Student(101, "Ram", "Oracle");
		
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
