//6. Write a Java program to remove a specific element from an array.

package com.array;

import java.util.Scanner;

public class _6RemoveElement {

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
		System.out.println("Enter the number that you want to remove");
		int number = scan.nextInt();
		int sizeOfNewArray=size-1;
		System.out.println("size of new array "+sizeOfNewArray);
		int indexOfNewArray=0;
		int [] newArr= new int[sizeOfNewArray];
		for(int i=0; i<size; i++) {
			if(number==arr[i]) {
				System.out.println("do nothing");
				
			}
			else if(i<size){
				newArr[indexOfNewArray]=arr[i];
				indexOfNewArray++;
				System.out.println("in else block");
			}
		}
		System.out.println("After removing number, Array is :");
		for(int x: newArr) {
			System.out.print(x +" ");
		}
		scan.close();
	}

}
