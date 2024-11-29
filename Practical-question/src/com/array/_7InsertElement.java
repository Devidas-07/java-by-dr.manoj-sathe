//7. ⁠⁠Write a Java program to insert an element (specific position) into an array.

package com.array;

public class _7InsertElement {

	public static void main(String[] args) {
		int [] arr = {34,23,78,98,45,12};
		int [] newArr = new int[arr.length+1];
		int pos = 4;
		int element = 48;
		int index=0;
		for(int i=0; i<newArr.length; i++) {
			if(i==pos){
				newArr[i]=element;
			}
			else {
				newArr[i]=arr[index];
				index++;
			}
		}
		System.out.println("print new array");
		for(int num: newArr) {
			System.out.println(num +" ");
		}

	}

}
