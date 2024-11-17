package com.array;

public class _14AdditionOfTwoMatrices {

	public static void main(String[] args) {
		int [][] a = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int [][] b = {{13,14,15,16},{17,18,19,20},{21,22,23,24}};
		System.out.println("printing a array ");
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(+a[i][j]+b[i][j]);
			}
			System.out.println(" ");
		}
		

	}

}
