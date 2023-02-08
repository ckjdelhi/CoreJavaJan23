package com.array;

public class Array3dDemo {

	public static void main(String[] args) {
		int [][][]arr3d = new int[3][2][3]; //dim x row x col
		arr3d[0][0][0] = 3;
		arr3d[0][0][1] = 3;
		arr3d[0][0][2] = 3;
		arr3d[0][1][0] = 4;
		arr3d[0][1][1] = 4;
		arr3d[0][1][2] = 4;
		
		arr3d[1][0][0] = 30;
		arr3d[1][0][1] = 20;
		arr3d[1][0][2] = 40;
		arr3d[1][1][0] = 50;
		arr3d[1][1][1] = 50;
		arr3d[1][1][2] = 60;
		
		
		arr3d[2][0][0] = 3;
		arr3d[2][0][1] = 3;
		arr3d[2][0][2] = 3;
		arr3d[2][1][0] = 4;
		arr3d[2][1][1] = 4;
		arr3d[2][1][2] = 4;
		
		for(int i=0; i<arr3d.length; i++) {
			for(int j=0;j<arr3d[i].length;j++) {
				for(int k=0;k<arr3d[i][j].length;k++) {
					System.out.print(arr3d[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("\nUsing for Each loop");
		for(int [][]a: arr3d) {
			for(int []b: a) {
				for(int c: b) {
					System.out.print(c+" ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
