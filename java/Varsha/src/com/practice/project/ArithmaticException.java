package com.practice.project;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArithmaticException {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value frist");
		int a = sc.nextInt();
		System.out.println("enter the second value");
		int b = sc.nextInt();

		try {
			int div=a/b;
			System.out.println(div);
		} catch (Exception e) {
			System.out.println("somthing went wrong"+e);
			throw new FileNotFoundException("abc");
			// TODO: handle exception
		}
	}
}
