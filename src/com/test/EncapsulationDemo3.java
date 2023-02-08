package com.test;

import com.oops.EncapsulationDemo;

public class EncapsulationDemo3 extends EncapsulationDemo {

	public static void main(String[] args) {
		EncapsulationDemo obj=new EncapsulationDemo();
		//System.out.println(obj.aDef);
		System.out.println(obj.bPub);
		//System.out.println(obj.cPriv);
		//System.out.println(obj.dPro);
		
		
		
		EncapsulationDemo3 obj2=new EncapsulationDemo3();
		//System.out.println(obj2.aDef);
		System.out.println(obj2.bPub);
		//System.out.println(obj2.cPriv);
		System.out.println(obj2.dPro);

	}

}
