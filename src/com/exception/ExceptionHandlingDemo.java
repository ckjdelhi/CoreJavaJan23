package com.exception;

import java.util.Scanner;

/*
 * try-catch
 * try-catch-catch
 * try-catch-catch-finally
 * try-finally
 */
public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter num1:");
			int a = sc.nextInt(); //InputMismatchException
			if(a<18) {
				throw new AgeInvalidException("Your age is not valid");
			}
			System.out.println("Enter num2:");
			int b= sc.nextInt();
			int res = a/b;
			System.out.println("Result ="+res);
		}catch (AgeInvalidException e) {
			e.printStackTrace();
			//com.exception.AgeInvalidException: Your age is not valid
			//at com.exception.ExceptionHandlingDemo.main(ExceptionHandlingDemo.java:19)

		}catch (NullPointerException e) {
			System.out.println("Error while getting length");
		}catch (ArithmeticException e) {
			e.printStackTrace();
			//java.lang.ArithmeticException: / by zero
			//at com.exception.ExceptionHandlingDemo.main(ExceptionHandlingDemo.java:23)
		
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("Error while getting length");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error while getting length");
		}catch(Exception e) {
			System.out.println("default exception handled");
		}finally {
			System.out.println("finally block");
			sc.close();
		}
		
		
		
	}

}
