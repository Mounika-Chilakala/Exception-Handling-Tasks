package com.exceptionhandling;

public class IllegalArgsTask9 {
	public static void setAge(int age) {
		if(age<0) {
			throw new IllegalArgumentException("Age should be positive only");
		}
		System.out.println("Age set to:"+age);
	}
	public static void main(String[] args) {
		try {
			System.out.println("The changeble age is:");
			setAge(-4);
		}catch(IllegalArgumentException e) {
			System.out.println("Error:"+e.getMessage());
		}finally {
			System.out.println("Successfully Completed");
		}
	}

}
