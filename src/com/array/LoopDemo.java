package com.array;

import java.util.Arrays;

public class LoopDemo {

	public static void main(String[] args) {
		
		String str[] = {"Chandan", "Ram", "Mohan"};
		
		Arrays.asList(str).forEach(a -> System.out.println(a));
		
		for(int i=0; i<str.length;i++) {
			System.out.println(str[i]);
		}
		

		for(String s:str) {
			System.out.println(s);
		}
		
		String [][]arr2d= {
				{"India", "US"},
				{"Nepal", "UK"},
		};
		
		for(String []abc:arr2d) {
			for(String s:abc) {
				System.out.println(s);
			}
		}
	}

}
