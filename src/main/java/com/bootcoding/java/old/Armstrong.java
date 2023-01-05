package com.bootcoding.java.old;

// wap to check whether a no is armstrong or not
class Armstrong {
	public static void main(String [] args){
		int sum = 0;
	int rem =0;
	int n = 444;
	int temp = n;
	while(n!=0){
	int div = n/10 ;
	rem= n%10;
	sum = sum + (rem*rem*rem);
	n=n/10;
	}
	
	if (rem==temp){
	System.out.println(rem +"Is  an Armstrong Number");
	}else{
		System.out.println(rem +" Is Not an Armstrong Number");
	}
	}
}
