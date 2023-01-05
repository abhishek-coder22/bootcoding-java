package com.bootcoding.java.old;

// WAP of prime number in arguments
 public class PrimeNumber2 {
	public static void main(String [] args){
	String num = args[0];
	int n = Integer.parseInt(num);
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