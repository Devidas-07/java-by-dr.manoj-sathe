package com.array;

public class RemoveEvenInteger {
	public static void main(String args[]) {
		int[] numbers= {3,5,3,7,9,4,8,7};
		int oddCount=0;
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]%2!=0) {
				oddCount++;
			}
		}
		System.out.println("odd count is "+oddCount);
		int[] result= new int[oddCount];
		int index=0;
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]%2!=0) {
				result[index]=numbers[i];
				index++;
			}
		}
		for(int even:result) {
			System.out.println(even);
		}
	}
}
