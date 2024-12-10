package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchTask5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the number:");
			int number=sc.nextInt();
			System.out.println("The number is:"+number);
		}catch(InputMismatchException ie) {
			System.out.println("Invalid input,the input must be integer");
		}finally {
			System.out.println("Successfully completed");
		}
	}

}
