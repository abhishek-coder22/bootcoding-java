package com.bootcoding.java.old;

// Program of post Increment
public class Example3 {
public static void main(String args[]){
	System.out.println("POST INCREMENT BY ONE");
	int postIncrement = 5;
	System.out.println("Initial value:"+ postIncrement);
	System.out.println("postIncrement++="+(postIncrement++));
	int result = 10+postIncrement++;
	System.out.println("result(10+postIncrement++)="+result);
	System.out.println("postIncrement++="+postIncrement);
	System.out.println();
	}
	}