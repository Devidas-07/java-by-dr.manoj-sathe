package com.array;

public class AverageOfPositiveValue {

	public static void main(String[] args) {
		int x []= {-3,-2,0,-7,25,12,-11};
		float addition=0;
		float count =0;
		float result=0.0f;
		for(int i=0; i<x.length; i++) {
			if(!(x[i]<=0)) {
				addition= addition+x[i];
				count++;
			}
		}
		System.out.println("average");
		System.out.println("addition is "+addition);
		System.out.println("count is "+count);
		result= addition/count;
		System.out.println(result);
		
		

	}

}
