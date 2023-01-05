package com.bootcoding.java.old;

//Wap to count the number of digits in a given number
class Digits2 {
public static void main(String []args){
  String n= args[0];
	
	int count=0 ;
	while(n!=0){
	int div = n/10;
	count++;
	n=div;
	}
	System.out.println(count);
	
	}
	}
	
	