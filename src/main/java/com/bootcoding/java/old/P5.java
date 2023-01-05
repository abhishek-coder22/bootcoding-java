package com.bootcoding.java.old;//5) WAP to convert a given integer (in seconds) to hours, //minutes and
//seconds.
//Test Data :
//Input seconds: 25300

//Expected Output:
//There are:
//H:M:S - 7:1:40

class P5 {
	public static void main(String[]args){
     
	int seconds = 25300;
	//int s = 0;
	int Seconds = seconds% 60;
	int Hours = seconds/60;
	int Minutes = Hours %60;
	Hours=Hours/60;
	System.out.println(Hours+ ":" +Minutes+ ":" +Seconds);
	//System.out.println("/s");
	}
	}
