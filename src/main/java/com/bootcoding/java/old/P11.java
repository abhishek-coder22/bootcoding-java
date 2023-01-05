package com.bootcoding.java.old;// 1) Print sum of elements of an array

class P11 {
	public static void main(String []args){
	int []array = {8,5,11,15,2};	
	int sum =0;
		for(int i=0; i<array.length;i++){
			sum = sum+ array [i];	
		}
	System.out.println("Sum of elements of array is = " + sum );
	}
}
