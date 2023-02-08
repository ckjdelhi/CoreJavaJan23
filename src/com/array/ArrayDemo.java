package com.array;

public class ArrayDemo {

	public static void main(String[] args) {
		int a=5;
		
		//Array 1D
		int b[] = new int[6];
		b[0]= 4;
		b[1]= 2;
		b[2]= 3;
		b[3]= 5;
		b[4]= 6;
		b[5]= 7;
		//b[5]= 7;//ArrayIndexOutOfBoundsException
		
		int c[]= {2, 4,5,2,5};
		
		//System.out.println(b.length);
		
//		for(int i=0;i<b.length; i++) {
//			System.out.println(b[i]);
//		}
		
//		int j=0;
//		while(j<b.length) {
//			System.out.println(b[j]);
//			j++;
//		}
		
		for(int arr:b) {
			System.out.println(arr);
		}
		
	}

}
