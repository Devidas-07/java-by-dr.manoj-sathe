package com.array;

public class _16Average {

	public static void main(String[] args) {
		int [] arr= {10,20,30,40,50};
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]> arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int result=0;
		float average=0;
		for(int i=1; i<arr.length-1; i++) {
			result= result+arr[i];
		}
		System.out.println("result is "+result);
		int denometer = arr.length-2;
		average=result/denometer;
		System.out.println("average is :"+average);

	}

}
