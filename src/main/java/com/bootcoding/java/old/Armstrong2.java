package com.bootcoding.java.old;

class Armstrong2 {
	public static void main(String []args) {
		String num1 = args[0];
	int n= Integer.parseInt(num1);
	int rem =0;
	
	int temp = n;
	while(n!=0){
	int div = n/10 ;
	rem = +(n*n*n);
	
	n = div ;
	}
	if(rem==temp){
	System.out.println(rem +"Is Not an Armstrong Number !");
	}else{
		System.out.println(rem +" Is an Armstrong Number !");
	}
	}
}
