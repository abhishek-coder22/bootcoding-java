package com.bootcoding.java.old;//2) WAP to compute the perimeter and area of a rectangle //with a height of
//7 inches. and width of 5 inches.
//Expected Output:
//Perimeter of the rectangle = 24 inches
//Area of the rectangle = 35 square inches

class P2 {
public static void main (String args[]){
	int l= 7;
	int w = 5;
	int sum1 = 0;
	int sum2 = 0;
	int sum3 = 0;
//	int sum4 = 0;	
		sum1 = l + l;
		sum2 = w + w;
	sum3 = sum1 + sum2;
	//sum4 = l * w;	
	System.out.println(" Perimeter of the rectangle " + (sum1+sum2));
System.out.println(" Area of the rectangle " + (l*w));
}
}	
		

