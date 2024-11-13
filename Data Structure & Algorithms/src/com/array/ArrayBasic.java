package com.array;

public class ArrayBasic {
	public static void main(String args[]) {
		ArrayDemo array= new ArrayDemo();
		array.creatArray();
	}
}
class ArrayDemo{
	public void creatArray() {
		int[] numbers= new int[6];
		numbers[2]=4;
		numbers[3]=6;
		numbers[5]=2;
		printArrray(numbers);
	}
	public void printArrray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+ " ");
		}
	}
}
