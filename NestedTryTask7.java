package com.exceptionhandling;

public class NestedTryTask7 {
	public static void main(String[] args) {
		try {
			System.out.println("Outer block started");
			int[] marks= {10,28,17,26};
			System.out.println("marks which you want:"+marks[0]);
			try {
				System.out.println("Inner block started");
				int result=marks[0]/0;
				System.out.println("Result of division:"+result);
			}catch(ArithmeticException e) {
				System.out.println("Division by zero is not allowed");
			}
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Array index is out of bound");
		}finally {
			System.out.println("Successfully completed");
		}
	}

}
