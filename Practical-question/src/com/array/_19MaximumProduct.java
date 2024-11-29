//19. Write a Java program to find the maximum product of two integers in a given array of integers.  
package com.array;

public class _19MaximumProduct {

	public static void main(String[] args) {
		int [] arr= {2, 3, 5, 7, -7, 5, 8, -5 };
		float product = 0;
		float maxProduct=0;
		for(int i =0; i<=arr.length-1; i++) {
			for(int j=i+1; j<=arr.length-1; j++) {
				 product= arr[i]*arr[j];
				 if(maxProduct<product) {
					 maxProduct=product;
				 }
				System.out.println("product is "+product);
			}
		}
		System.out.println("maximum product is: "+maxProduct);

	}

}
