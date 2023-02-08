package com.test;

public class OperatorsDemo {

	public static void main(String[] args) {
		int x = 5;
		System.out.println(++x + -x);
		
		//System.out.println("" + (1+2+3) + 1); //61
		
		//Arithmetic Operator(+(addition), -, *, /, %)
//		int a = 5;
//		int b = 6;
//		
//		System.out.println(a / b); //0
//		System.out.println(a % b); //5
//		
		
		//System.out.println(1234234231 % 2); // output: 0 = even, else= old
		
		
		//Unary Operators(+(positive), -(negative), ++ (increment - pre/post), --(decrement -pre/post), !)
//		int a = -3;
//		boolean b = true;
//		System.out.println(!b);
//		
//		int a = 5;
//		a++; //6(post increment) a = a+1
//		++a; //7(pre increment)
//		--a;//6
//		--a;//5
//		--a;//4
//		System.out.println(a);//4

//		int a = 5;
//		System.out.println(--a + a-- + a);//4 + 4 + 3
		
		//Relational Operators(>, <, >=, <=, ==, !=): output of relational operator is in boolean value
		
//		int a=5;
//		int b=6;
//		System.out.println(a>b);
//		System.out.println(a>=b);
//		System.out.println(a==b);
//		System.out.println(a != b);
		
		
		//Logical Operators(&&(and), ||(or)): output is in boolean
//		int a =5;
//		int b =6; 
//		int c =7;
//		System.out.println(a>b && a>c);//false && false => false
//		System.out.println(b>a && b>c);//true && false => false
//		System.out.println(c>a && c>b);//true && true => true
		/*
		 &&
		 true && true = true
		 false && true = false
		 false && false = false
		 true && false = false
		  ||
		 true || true = true
		 false || true = true
		 true || false = true
		 false || false = false
		 */
		
		
		//Ternary Operator((condition)?(true statement):(false statement))
//		int a=50;
//		int b=13;
//		if(a>b) {
//			System.out.println("a is greater than b");
//		}else {
//			System.out.println("b is greater than a");
//		}
//		
//		System.out.println(a>b?"a is greater than b":"b is greater than a");
		
		/*
Binary number
0000 = 0
0001 = 1
0010 = 2
0011 = 3
0100 = 4
0101 = 5
0110 = 6
0111 = 7
1000 = 8
1001 = 9
1010 = 10
1011 = 11
1100 = 12
1101 = 13
1110 = 14
1111 = 15


		 */
		//Bitwise operators(&, |): it always works on binary number
//		int a = 2003;
//		System.out.println(a | 7);
//		System.out.println(Integer.toBinaryString(16));
//		System.out.println((a & 1) == 0? "Even": "Odd");
		
		//Shift operators(<<, >>): it always works on binary number
		int a = 10;
		System.out.println(a<<2);//number * 2^n = 10 * 2^2 = 40
		System.out.println(a>>2);//number / 2^n = 10 / 2^2 10/4
		System.out.println(10/4);
		System.out.println(Integer.toBinaryString(40));
	}

}
