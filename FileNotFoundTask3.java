package com.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundTask3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the file name:");
			String filename=sc.next();
			File file=new File(filename);
			Scanner read=new Scanner(file);
			System.out.println("File contents:");
			while(read.hasNext()) {
				System.out.println(read.next());
			}
		}catch(FileNotFoundException fn) {
			System.out.println("File cant be found.");
		}finally {
			System.out.println("Successfully Completed.");
		}
	}

}
