package com.exceptionhandling;

public class NullPointerTask4 {
	public static void main(String[] args) {
		String name=null;
		try {
			System.out.println("The length of the string is:"+name.length());
		}catch(NullPointerException ne) {
			System.out.println("Cant find length for null values");
		}finally {
			System.out.println("Successfully completed");
		}
	}

}
