package com.bootcoding.java.old;

//wap to sum of first and last digit of  a number
class Digit4{
public static void main(String [] args){
	int sum = 578;
	int first  = 0;
	int last = sum %10 ;	
	while(sum!=0){
	first=sum;
	sum=sum/10;	
	} 			
	int s = first+last;
System.out.println("first = " + first );
System.out.println("last = " + last );	
System.out.println("sum = " + s );
}
}