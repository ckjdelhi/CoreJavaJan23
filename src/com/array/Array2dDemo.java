package com.array;

public class Array2dDemo {

	public static void main(String[] args) {
		
		int a[] = {1,2,3, 3, 5,3};
		int b[] = {4,5,6, 7, 8,10};
		
		int c[] = new int[a.length + b.length];// 0 1 2 3 4 ...11
		
		int index =1;
		for(int arr: a) {
			c[index] = arr;
			index++;
		}
		for(int arr: b) {
			c[index] = arr;
			index++;
		}
		
		for(int arr: c) {
			System.out.print(arr +" ");
		}
		
		
		String s="Hello World asf asdf wer sdf were";
		System.out.println("Total words: "+s.split(" ").length);
		
		System.out.println(s.charAt(1));
		int arr[]= {0 , 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int n = 6;
		n = arr[arr[n]/2];
		System.out.println(arr[n]/2);

		
//		int[][]arr2d=new int[2][3]; //row x col : to rename: alt+shift+r
//		System.out.println(arr2d);
//		arr2d[0][0] = 5;
//		arr2d[0][1] = 4;
//		arr2d[0][2] = 2;
//		
//		arr2d[1][0] = 1;
//		arr2d[1][1] = 2;
//		arr2d[1][2] = 3;
//		
//		for(int i=0; i<arr2d.length;i++) {//row
//			for(int j=0;j<arr2d[i].length;j++) {//col
//				System.out.print(arr2d[i][j] +" ");
//			}
//			System.out.println();
//		}
//		System.out.println("\nUsing forEach loop");
//		for(int[] arr:arr2d) {
//			for(int a: arr) {
//				System.out.print(a+" ");
//			}
//			System.out.println();
//		}
//		

	}

}
