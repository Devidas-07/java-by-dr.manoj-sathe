//12. ⁠Write a Java program to find the second largest element in an array.

package com.array;

public class _12SecondLargestNumber {

	public static void main(String[] args) {
		int [] arr= {23,35,56,98,89,24,67};
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] <arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Second Largest Number is :"+arr[1]);
		

	}

}
