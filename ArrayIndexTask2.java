package com.exceptionhandling;

import java.util.Scanner;

public class ArrayIndexTask2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			int[] marks= {30,50,45,67,29};
			System.out.println("Array elements are:");
			for(int i=0;i<marks.length;i++) {
				System.out.println("Index "+i+":"+marks[i]);
			}
			System.out.println("Enter the index which you want:");
			int index=sc.nextInt();
			System.out.println("Element at index "+index+":"+marks[index]);
		}catch(ArrayIndexOutOfBoundsException aio) {
			System.out.println("Invalid input.Please enter an index in between 0 to 4");
		}finally {
			System.out.println("Successfully completed");
		}
	}

}
