package com.bootcoding.java.old;

import java.util.Scanner;
public class getDiscount {
	public static void getDiscount(int Discount){
	if(Discount>=8){
	System.out.println("Your Discount Is 50%");
	}
	else if(Discount>=5){
	System.out.println("Your Discount Is25%");
	}
	else if(Discount>=1){
	System.out.println("Your Discount Is10%");
	}
	else {
	System.out.println("No Discount 0");
	}
	}
	public static void main(String []args){
	System.out.println("Enter Number ");
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	getDiscount(n);
	}
	}
