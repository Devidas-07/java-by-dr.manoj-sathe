/*18. Given two sorted arrays A and B of size p and q, write a Java program to merge elements of A with B by maintaining the sorted order i.e. fill A with first p smallest elements and fill B with remaining elements.  

Example:
Input :
int[] A = { 1, 5, 6, 7, 8, 10 }
int[] B = { 2, 4, 9 }
Output:
Sorted Arrays:
A: [1, 2, 4, 5, 6, 7]
B: [8, 9, 10]
*/


package com.array;

public class _18MergingTwoArray {

	public static void main(String[] args) {
		int[] a = { 1, 5, 6, 7, 8, 10 };
		int[] b = { 2, 4, 9 };
		
		int []c = new int [a.length+b.length];
		for(int i=0; i<c.length; i++) {
			if(i<a.length) {
				c[i]=a[i];
			}
		}
		
		int index =0;
		for(int j=a.length; j<c.length; j++) {
			if(index<b.length) {
				c[j]=b[index];
				index++;
			}
		}
		for(int num: c) {
			System.out.println(num +" ");
		}
		
		for(int i=0; i<c.length; i++) {
			for(int j=i+1; j<c.length; j++) {
				
				if(c[i]>c[j]) {
					int temp = c[i];
					c[i]=c[j];
					c[j]=temp;
				}
				
			}
		}
		System.out.println("Array c, after operation");
		for(int number: c) {
			System.out.println(number +" ");
		}
		int indexOfB=0;
		for(int i=0; i<c.length; i++) {
			if(i<a.length) {
				a[i]=c[i];
			}
			if(i>=a.length) {
				b[indexOfB]=c[i];
				indexOfB++;
			}
		}
		System.out.println("after adding elements to a array");
		for(int number: a) {
			System.out.println(number +" ");
		}
		System.out.println("after adding elements to b array");
		for(int number: b) {
			System.out.println(number +" ");
		}
		

	}

}
