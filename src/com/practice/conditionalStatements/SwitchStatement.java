package com.practice.conditionalStatements;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		double n1=Math.PI*n;
//		List<Double> arr=new ArrayList();
//		System.out.println(arr[1]);
		
		switch (n) {
		case 1:
			System.out.println("1 Monday");
			break;
		case 2:
			System.out.println("2 Tuesday");
			break;
		case 3:
			System.out.println("3 wednesday");
			break;
		case 4:
			System.out.println("4 Thursday");
			break;
		case 5:
			System.out.println("5 friday");
			break;
		case 6:
			System.out.println("6 satutday");
			break;
		case 7:
			System.out.println("7 sunday");
			break;
		}

	}

}
