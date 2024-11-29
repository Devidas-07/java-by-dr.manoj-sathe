//17. ⁠Write a Java program to remove duplicate elements from a given array and return the updated array length.
//Sample array: [20, 20, 30, 40, 50, 50, 50]
package com.array;
public class _17RemoveElementAndUpdateArray {

	public static void main(String[] args) {
		int []arr= {27,35,67,67,23,89,67,99,12};
		int [] newArr= new int[arr.length];
		int index= 0;
		for(int i=0; i<arr.length; i++) {
			boolean duplicate=false;
			for(int j=0; j<index; j++) {
				if(arr[i]==newArr[j]) {
					duplicate=true;
					break;
				}
			}
				if(duplicate) {
					System.out.println(arr[i]);
				}
				else {
					newArr[index++]=arr[i];
				}
			
		}
		System.out.println("after editing ");
		System.out.println("length of new array is "+index);
		for(int i=0; i<index; i++) {
			System.out.println(newArr[i]);
		}
		
	
	}

}

