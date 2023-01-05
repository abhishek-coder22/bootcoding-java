package com.bootcoding.java.old;

//wap to find first and last digit of a number
 class Digit3 {
	public static void main(String [] args){
	int num= 5784;
	int first  = 0;
	int last = num % 10;	
	while(num!=0){
	first=num;
	num=num/10;	
	}
System.out.println("first = " + first );
System.out.println("last = " + last );	
}
}