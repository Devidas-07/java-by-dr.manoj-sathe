package com.array;

public class _15MoveZeroesToTheEnd {

	public static void main(String[] args) {
		int [] arr= {0,12,0,23,0,89,0,7,8,0,2,0};
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==0) {
					int temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int num: arr) {
			System.out.println(num);
		}

	}

}
