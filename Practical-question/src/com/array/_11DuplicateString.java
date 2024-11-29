//11. ⁠Write a Java program to find duplicate values in an array of string values.

package com.array;

public class _11DuplicateString {

	public static void main(String[] args) {
		String [] values = {"ram", "sham","sham", "kartik", "ganesh","ram"};
		for(int i=0; i<values.length; i++) {
			for(int j=i+1; j<values.length; j++) {
				if(values[i].equals(values[j])) {
					System.out.println("duplicate string is "+values[i]);
				}
			}
		}
	}

}
