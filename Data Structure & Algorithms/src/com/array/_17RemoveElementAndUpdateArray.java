package com.array;

public class _17RemoveElementAndUpdateArray {

	public static void main(String[] args) {
		int [] arr= {20, 20, 30, 40, 50, 50};
		System.out.println("Size of old array: "+arr.length);
		int count=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println("i is "+i);
					System.out.println("j is "+j);
					System.out.println(arr[i]+ "and"+ arr[j]);
					System.out.println("in if block");
					count++;
				}
			}
		}
		System.out.println("count is "+count);
		int sizeOfarr1 = arr.length-count;
		System.out.println("size of new arr1 "+sizeOfarr1);
		int [] arr1= new int [sizeOfarr1];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]!=arr[j]) {

					
					System.out.println("in if block");
					arr1[i]=arr[i];
					
					
				}
				else {
					System.out.print("duplicate element is"+arr[i]);
					
				}
			}
		}
		System.out.println("After deleting duplicate element, Array is :");
		for(int x: arr1) {
			System.out.println(x);
		}

	}

}
