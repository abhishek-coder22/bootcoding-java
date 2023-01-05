package com.bootcoding.java.old;

// WAP to find a Prime Number
class PrimeNumber1 {
	 int x = 29;
	 int b = 0 ;
	 if (x<=1) {
		 System.out.println("The number is not prime");
		 return;
	 }
  
    for (int i = 2; i<= x/2 ; i++) {
		if(x%i==0){
			b++;
		}
		if (b>1){
			System.out.println("The number is not prime");
		}
		else{
			System.out.println("The number is  prime");
		}
	}
}
			
			
		
	
	
      
   