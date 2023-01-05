package com.bootcoding.java.old;

public class Prime {
	public static void main(String args[]){
		int n = 14;
		int i;
		boolean isPrime = true;
		for(i=2;i<n;i++)
		{
			if(n%i==0){
				System.out.println(n + " Is Not Prime number!");
				isPrime = false;
				break;
			} 
		}
		if(isPrime){
			System.out.println(n+ " Is  Prime Number ! "  );
		}
	}
}