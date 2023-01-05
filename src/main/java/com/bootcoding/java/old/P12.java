package com.bootcoding.java.old;

// Find Armstrong number in a given array
 class P12 { 
	public static void main(String[]args){
	int a []= {121,451,697,785,365};
	int div = 0;
	int i = 0;
	int sum = 0;
	int temp = num[i];
	int rem = 0;
	for(i=0; i<num.length; i++){
		rem = num[i]/10;
		div = num[i]%10;
		sum=sum+(rem*rem*rem);
	
	if (sum==temp){
	System.out.println(sum+"Is  an Armstrong Number");
	}else{
		System.out.println(sum +" Is Not an Armstrong Number");
 }
	}
	}
 }