//4. ⁠Write a Java program to test if an array contains a specific value.
package com.array;

import java.util.Scanner;

public class _4SearchingInArray {

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
		System.out.println("Enter the number that you want to check if array contains a specific element");
		int specificNum= scan.nextInt();
		CheckNumber check= new CheckNumber();
		boolean isAvailiable =check.isNumberAvaliable(arr, specificNum);
		if(isAvailiable) {
			System.out.println(specificNum+"the number is availiable in array");
		}
		else {
			System.out.println(specificNum+" the number is not avaliable in array");
		}
		scan.close();

	}

}
class CheckNumber{
	public boolean isNumberAvaliable(int [] arr, int num) {
		boolean ans = false;
		for(int i=0; i<arr.length; i++) {
			if(num==arr[i]) {
				ans=true;
			}
			
		}
		return ans;
	}
}
