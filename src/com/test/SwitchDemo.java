package com.test;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		System.out.println("*************Welcome to Hotel booking site ************");
		System.out.println("1. New booking");
		System.out.println("2. Update exising booking");
		System.out.println("3. Cancel booking");
		System.out.println("4. exit");
		System.out.println("Choose any option from above: ");
		
		//Take input from User
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		float f= sc.nextFloat();
		
		
		
		switch(num) {
			case 1:
				System.out.println("****** New booking Menu *******");
				System.out.println("Enter your name:");
				String name = sc.next();
				break;
			case 2:
				System.out.println("*********Update exising booking Menu ********");
				break;
			case 3:
				System.out.println("3");
				break;
			case 4:
				System.out.println("4");
				break;
			case 5:
				System.out.println("5");
				break;
			case 6:
				System.out.println("6");
				break;
			default:
				System.out.println("not matching with input");
				break;
		}
	}

}
