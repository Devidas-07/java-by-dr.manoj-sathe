package com.array;

//10. ⁠Write a Java program to find duplicate values in an array of integer values.

public class _10FindDuplicateElement {

	public static void main(String[] args) {
		   int[] array = {10, 20, 10, 30, 20, 10, 40, 20};
	        int[] newArray = new int[array.length];
	        int index = 0;

	        System.out.println("Duplicates in Array:");

	        for (int i = 0; i < array.length; i++) {
	        	
	            boolean isDuplicate = false;
	            for (int j = 0; j < index; j++) {
	            	
	                if (array[i] == newArray[j]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }

	            if (isDuplicate) {
	                System.out.println(array[i]); 
	            } else {
	                newArray[index++] = array[i]; 
	            }
	        }

	        System.out.println("\nNew Array:");
	        for(int i=0; i<index; i++) {
	        	System.out.println(newArray[i]);
	        }

		
		
	}

}
