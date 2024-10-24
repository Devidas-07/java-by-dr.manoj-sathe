package com.questions;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String clgName = scan.nextLine();
		System.out.println("previous string " + clgName);
		char arr[] = clgName.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'i' || arr[i] == 'I') {

				arr[i] = '$';

			}
		}
		for (char name : arr) {
			System.out.print(name);
		}
		scan.close();
		
	}

}

