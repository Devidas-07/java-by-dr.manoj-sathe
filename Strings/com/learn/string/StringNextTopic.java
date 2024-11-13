package com.learn.string;

import java.util.Scanner;

public class StringNextTopic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your city Name: ");
		String name = scan.nextLine().toLowerCase().trim();
		
		if(name.equals("pune")) {
			System.out.println("Namaskar Punekar");
		}
		else if(name.equals("kolhapur")) {
			System.out.println("Namaskar Kolhapurkar");
		}
		else if(name.equals("nashik")) {
			System.out.println("Namskar Nashikkar");
		}
		else {
			System.out.println("Enter Valid City Name");
		}

	}

}
