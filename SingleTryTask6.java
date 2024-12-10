package com.exceptionhandling;

public class SingleTryTask6 {
	public static void main(String[] args) {
		try {
			int[] number= {10,20,15,28};
			System.out.println("Array element which you want:"+number[4]);
			int result=number[1]/0;
			System.out.println("Result of division is:"+result);
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Array index is out of bound");
		}catch(ArithmeticException e) {
			System.out.println("Division by zero is not allowed");
		}finally {
			System.out.println("Successfully completed");
		}
	}

}
