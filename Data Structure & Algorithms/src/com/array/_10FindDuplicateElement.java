package com.array;

//10. ⁠Write a Java program to find duplicate values in an array of integer values.

public class _10FindDuplicateElement {

	public static void main(String[] args) {
		int [] arr= {13,23,67,89,34,67,23,23};		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
				}
				
			}
		}
		
	}

}
