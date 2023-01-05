package com.bootcoding.java.old;//4) WAP that accepts three integers and find the maximum of three.
//Test Data :
//Input the first integer: 25
//Input the second integer: 35
//Input the third integer: 15
//Expected Output:
//Maximum value of three integers: 35

class P4 {
	
   public static void main(String args[]) {
      int num1 = 85;
      int num2 = 35;
      int num3 = 45;
      if(num1 >= num2 && num1>=num3)
         System.out.println(num1+ "is the maximum number");
      if (num2 >= num3 && num2>=num3)
         System.out.println(num2+ "is the maximum number");
      else
         System.out.println(num3+ "is the maximum number");
   }
}

