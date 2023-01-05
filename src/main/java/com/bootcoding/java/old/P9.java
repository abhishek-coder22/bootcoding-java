package com.bootcoding.java.old;
//9) WAP in C to display the cube of the number upto given //an integer.
//Test Data :
//Input number of terms : 5
//Expected Output :
//Number is : 1 and cube of the 1 is :1
//Number is : 2 and cube of the 2 is :8
//Number is : 3 and cube of the 3 is :27
//Number is : 4 and cube of the 4 is :64
//Number is : 5 and cube of the 5 is :125

class P9 {
	public static void main(String args[]){
	String num1= args[0];
	int num= Integer.parseInt(num1);
	int res = 0;
	for(int i=1; i<=num; i++){
	res = i*i*i;
	System.out.println(" Number is : " + i+ " and cube of the " + i + " is "+ (res));
	}
	}
	}
	
	