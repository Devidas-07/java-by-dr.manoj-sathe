package com.learn.string;

public class StringVsStingBuffer {

	public static void main(String[] args) {
		/*String Class*/
		/*
		String s = new String ("MIBS");
		String s2 = new String ("MIBS");
		
		System.out.println(s==s2); //actual references are compared thats why output will false
		
		System.out.println(s.equals(s2));
		s.concat("java");
		System.out.println(s); // output : MIBS
		*/
		
		/*StringBuffer Class*/
		/*
		 
		StringBuffer sb = new StringBuffer("MIBS");
		StringBuffer sb2 = new StringBuffer("MIBS");
		System.out.println(sb==sb2);
		System.out.println(sb.equals(sb2));//false
		sb.append("java");
		System.out.println(sb); // output : MIBSjava
		
		*/
		/*
		 * why false?
		 * Root class of java is Object. Under this String and StringBuffer Classes
		 * In Object class there is equals() method
		 * in String class equals() method is overridden
		 * and in StringBuffer class equals() method is not overridden
		 */
		
		
		
		String s = new String ("MIBS");
		s.concat("institute");
		s = s.concat("pune");
		System.out.println(s);
	}

}
