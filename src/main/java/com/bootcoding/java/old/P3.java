package com.bootcoding.java.old;//3) to convert specified days into years, weeks and days.
//Note: Ignore leap year.
//Test Data :
//Number of days : 1329
//Expected Output :
//Years: 3
//Weeks: 33
//Days: 3

class P3 {
	public static void main(String[]args){
	int days = 1329; 	
	int weeks= 0;
	int years =0;	
	years = days/365; //1329/365, q=3, r=240
	days = days % 365; // 240
	weeks = days/7;
	days = days%7;	
	System.out.println(years);
	System.out.println(weeks);
	System.out.println(days);	
	}
	}
	