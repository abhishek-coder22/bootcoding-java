package com.bootcoding.java.old;

import java.util.Scanner;
public class GradeSystem3{	
public static void getGrade(int[] percentage){ 
for(int i=0; i < percentage.length; i++){
	getGrade(percentage[i]);
}
}
public static void  getGrade(int percentage){
	if(percentage>=75){
	System.out.println(percentage + " is eligible for A Grade");
	}
	if(percentage>=60){
	System.out.println(percentage + " is eligible for B Grade ");
	}
	else { System.out.println(percentage + " is eligible for C Grade");
	}
}
public static void main(String []args){
		GradeSystem3 g = new GradeSystem3();
Scanner scanner =new Scanner(System.in);
int [] numbers = new int[5];
for(int i = 0; i<5; i++){
System.out.println("Enter number " + i);
numbers[i]=scanner.nextInt();
}
g.getGrade(numbers);
	}
}