package com.bootcoding.java.old;

//WAP to find Armstrong Number or not
public class Armstrong3 {
	public static void main(String []args) {
	int rem =0;
	int n = 452;
	int temp = n;
	int sum =0;
	while(n!=0)
	{		
	int div = n/10;
	rem=n%10;	
	sum=sum+(rem*rem*rem);
	n=div;
	}
	if(sum==temp){
	System.out.println(sum +" Is an Armstrong Number !");
	}else{
		System.out.println(sum +" Is Not an Armstrong Number !");
	}
	} 	
}
