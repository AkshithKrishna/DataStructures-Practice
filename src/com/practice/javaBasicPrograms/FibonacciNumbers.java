package com.practice.javaBasicPrograms;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {

		System.out.println("Enter a Range");
		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		int n1=0,n2=1;
		for(int i=0;i<=range;i++)
		{
			System.out.print(n1+" ");
			int n3=n1+n2;
			n1=n2;
			n2=n3;
		}
	}

}
