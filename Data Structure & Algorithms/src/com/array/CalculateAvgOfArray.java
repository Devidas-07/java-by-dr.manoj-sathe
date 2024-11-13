package com.array;

import java.util.Scanner;

public class CalculateAvgOfArray {

	public static void main(String[] args) {
		System.out.println("enter the size of array");
		Scanner scan = new Scanner(System.in);
		int size =scan.nextInt();
		
		//array declaration
		int [] arr = new int [size]; //35,67,12,63,8
		
		//accepting input from user and assigning this value in array
		for(int i=0; i<size; i++) {
			System.out.println("enter "+i+ "th number");
			arr[i]=scan.nextInt();
		}
		scan.close();
		int result =0;
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println(i+"element is"+arr[i]);
			result = result+arr[i];
			
		}
		System.out.println("sum of arraya members is "+result);
		double avg= result/arr.length;
		System.out.println("Average of values of arrays member is "+avg);
	}

}
