package com.array;
public class AnnonymousArray {

	public static void main(String[] args) {
		//int [] x= {10,20,30};
		sum(new int[] {10,20,30});
		//sum(new int[][]{{10,25},{34,56}});
		
		//[] should be blank
	}
	public static void sum(int []x) {
		int total =0;
		for(int x1: x) {
			total = total +x1;
		}
		//System.out.println(total);
		
		
		
		
		
	}

}
