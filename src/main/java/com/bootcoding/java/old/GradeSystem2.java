package com.bootcoding.java.old;

import java.util.Scanner;
public class GradeSystem2{
public static void  getGrade( double[]percentage){
for(int i=0; i < percentage.length; i++){
	getGrade(percentage[i]);
}
}
	 public static void getGrade(double percentage){
	if(percentage>=75){
	System.out.println(percentage + " is eligible for A Grade");
	}
	if(percentage>=60){
	System.out.println(percentage + " is eligible for B Grade ");
	}
	else { 
	System.out.println(percentage + " is eligible for C Grade");
	}
	 } 
	public static void main(String []args){
		GradeSystem2 g = new GradeSystem2();
Scanner scanner =new Scanner(System.in);
double [] numbers = new double[5];
for(int i = 0; i<5; i++){
System.out.println("Enter number " + i);
numbers[i]=scanner.nextDouble();
}
g.getGrade(numbers);
	}
}
















