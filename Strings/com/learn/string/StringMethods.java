package com.learn.string;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "";
		
		System.out.println(s.isEmpty());
		String s1 = "Modern Institute of Business Studies";
		
		System.out.println(s1.length());//4
		
		System.out.println(s1.replace("u", "$"));
		
		System.out.println(s1.substring(3)); // s is small-> e
		
		System.out.println(s1.substring(5, 9)); //last index will treates as n-1
		
		String s3= "MIBS  INDIA";
		
		System.out.println(s3.indexOf("I"));
		
		//here I comes 3 times so to find index of last I
		
		System.out.println(s3.lastIndexOf("I"));
		System.out.println(s3.toLowerCase());
		System.out.println(s3.toUpperCase());
		System.out.println(s3.trim());
	}

}
