package com.exceptionhandling;

import java.util.Scanner;

public class DivisionTask1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the Numerator value:");
			int numerator=sc.nextInt();
			System.out.println("Enter the Denominator value:");
			int denominator=sc.nextInt();
			int result=numerator/denominator;
			System.out.println("The division of two numbers is:"+result);
		}catch(ArithmeticException ae){
			System.out.println("Division by zero is not allowed.");
		}finally {
			System.out.println("Division of two numbers is completed.");
		}
	}

}
