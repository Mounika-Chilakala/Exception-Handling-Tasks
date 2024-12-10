package com.exceptionhandling;

public class ClassNotFoundTask8 {
	public static void main(String[] args) {
		try {
			System.out.println("The class is:");
			Class.forName("com.example.ClassNotFoundTask8");
		}catch(ClassNotFoundException e) {
			System.out.println("The specified class is not found");
		}finally {
			System.out.println("Successfully Completed");
		}
	}

}
