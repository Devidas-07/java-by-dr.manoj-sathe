//1. Write a Java program to sort a numeric array and a string array.

package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class _1SortArray {

	public static void main(String[] args) {
		System.out.println("How many element do you want to insert?");
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
		//sorting of array
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size; j++) {
				if(arr[i]> arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//printing sorted array
		System.out.println("sorted array using without predefined methods is: ");
		for(int num: arr) {
			System.out.println(num);
		}
		System.out.println("sorted array using predefined method is: ");
		Arrays.sort(arr);
		for(int num: arr) {
			System.out.println(num);
		}
		
//		String [] strArr= {"ram", "sham","ganesh","kartik"};
//		Arrays.sort(strArr);
//		for(String s: strArr) {
//			System.out.println(s);
//		}
//		
	}

}
