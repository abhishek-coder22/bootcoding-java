package com.bootcoding.java.old;  //WAP to add even numbers and multiply odd numbers
  //WAP to sum two numbers if they are even else multiply them.
  
  class PrintNumbers { 
  public static void main(String []args){
  String num1 = args[0];
  String num2 = args[1];
  // Convert String into integer 
  int x = Integer.parseInt(num1);
  int y = Integer.parseInt(num2);
  if(x%2==0 && y%2==0){
	  int z = x+y; 
	System.out.println(  x + " + " + y + " Is " + z );
  }	else {
	  
	  int b = x*y;
	System.out.println(  x + " * " + y + " Is " + b );
	}
  }
  }