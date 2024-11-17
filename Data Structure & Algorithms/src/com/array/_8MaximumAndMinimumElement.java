package com.array;

public class _8MaximumAndMinimumElement {

	public static void main(String[] args) {
		int [] arr= {3,6,78,12,4,89,34,56};
		int maxElement=arr[0];
		int minElement=arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<minElement) {
				minElement=arr[i];
			}
			else {
				maxElement=arr[i];
			}
		}
		System.out.println("Max Element "+maxElement);
		System.out.println("Min Element "+minElement);

	}

}
