package com.string;

import java.util.Scanner;

/*
 * String object:
 * 1. using string literals
 * 2. using new keyword
 */
public class StringDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any text:");
		String text = sc.nextLine();
		System.out.println("Text= "+ text);
		
		String words[] = text.split(" ");
		
		String rev ="";
		
		for(String word: words) {
			for(int i=word.length()-1;i>=0;i--) {
				rev = rev + word.charAt(i);
			}
			rev =rev +  " ";
		}
		
		System.out.println("Reveresed ="+ rev);
		
		
//		int a =5;
//		int b =6;
//		System.out.println(a == b);
		
		
//		String s1="hi";
//		String s2="hi";
//		System.out.println(s1 == s2); //true
//		System.out.println(s1.equals(s2));//true
//		System.out.println(s1.equalsIgnoreCase(s2));
//		
//		String s3=new String("hi");
//		String s4=new String("hi");
//		System.out.println(s3 == s4); //false
//		System.out.println(s3.equals(s4));//true
		
//		String str ="Hello World";
//		System.out.println(str.length());//total chars
//		System.out.println(str.charAt(6));//W
//		System.out.println(str.indexOf("W"));//6
//		System.out.println(str.substring(6));//World
//		System.out.println(str.substring(0, 5));//Hello 
//		String []words = str.split(" ");
//		System.out.println(words[0]);
//		System.out.println(str.toUpperCase());
//		System.out.println(str.toLowerCase());
//		System.out.println(str.replace('H', 'Z'));
		
		
		
	}

}
