package com.bootcoding.java.old;

// WAP for calculation using methods
class Calculator {
	public static int add(int a, int b){
	int sum = a+b;
	return sum ;
	}
	public static double division(int a, int b){
	int div = a/b;
	return div ;
	}
	public static int mul(int a, int b){
	int mul = a*b;
	return mul ;
    }
	public static int sub(int a, int b){
	int sub = a-b;  
	return sub ;
	}
	public static void main(String[]args){
		
	int res = add(10,20);
	System.out.println(res);
	
	double div = division(20,5);
	System.out.println(div);
	
	int mul = mul(10,20);
	System.out.println(mul);
	
	int sub = sub(10,20);
	System.out.println(sub);
	
	}
	}
	