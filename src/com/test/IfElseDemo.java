package com.test;

/*
 * if
 * if-else
 * if-elseIf
 * if-elseIf-elseIf
 * if-elseIf-elseIf-else
 */
public class IfElseDemo {

	public static void main(String[] args) {
		
		int a = 15; 
		int b = 6;
		int c = 7;
		
		if(a>b) {
			System.out.println("a is greater number than b");
		}
		
		
		
		if(a>b) {
			System.out.println("a is greater number than b");
		}else {
			System.out.println("b is greater number than a");
		}
		
		
		if(a>b) {
			System.out.println("a is greater number than b");
		}else if(a>c){
			System.out.println("a is greater number than c");
		}
		
		if(a>b) {
			System.out.println("a is greater number than b");
		}else if(a>c){
			System.out.println("a is greater number than c");
		}else if(a>c){
			System.out.println("a is greater number than c");
		}else if(a>c){
			System.out.println("a is greater number than c");
		}else if(a>c){
			System.out.println("a is greater number than c");
		}else if(a>c){
			System.out.println("a is greater number than c");
		}
		
		if(a>b) {
			System.out.println("a is greater number than b");
		}else if(a>c){
			System.out.println("a is greater number than c");
		}else if(a>c){
			System.out.println("a is greater number than c");
		}else if(a>c){
			System.out.println("a is greater number than c");
		}else if(a>c){
			System.out.println("a is greater number than c");
		}else if(a>c){
			System.out.println("a is greater number than c");
		}else {
			System.out.println("default...");
		}
	}

}
