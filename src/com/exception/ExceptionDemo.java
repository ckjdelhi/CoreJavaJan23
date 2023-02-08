package com.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		//String s=null;
		//System.out.println(s.length()); //NullPointerException
		
		//String s="abc";
		//System.out.println(Integer.parseInt(s));//NumberFormatException
		
		//int a = 5/0; //ArithmeticException
		//System.out.println(a);
		
		//String s="abc";
		//System.out.println(s.charAt(3));//StringIndexOutOfBoundsException
		
//		int arr[]=new int[5];
//		arr[0]=3;
//		arr[1]=3;
//		arr[2]=3;
//		arr[3]=3;
//		arr[4]=3;
//		arr[5]=3;//ArrayIndexOutOfBoundsException
//		System.out.println(arr.length);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter num1:");
//		int a = sc.nextInt(); //InputMismatchException
//		System.out.println("Enter num2:");
//		int b= sc.nextInt();
//		
//		int res = a/b;
//		System.out.println("Result ="+res);
		
		try {
			InputStream is= new FileInputStream(new File("abc.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
