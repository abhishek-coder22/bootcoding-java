package com.bootcoding.java.old;

import java.util.Scanner;
public class GradeSystem {
	public static char getGrade(double percentage){
	if(percentage>=75){
	return 'A';
	}
	if(percentage>=60){
	return 'B';
	}
	return 'C';
	}
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	double n= sc.nextDouble();
	System.out.println(getGrade(n));
	}
	}