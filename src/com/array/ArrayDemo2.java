package com.array;

public class ArrayDemo2 {

	public static void main(String[] args) {
		String []arr = {"Ram", "Mohan", "Chandan"};
		for(String a: arr) {
			System.out.println(a);
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
