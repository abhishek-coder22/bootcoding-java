package com.bootcoding.java.old;

public class ForLoop2 {
	public static void main(String[]args){
	int age = 53;
	int temp = age; 
	//check - E-divide by 2 or odd - Subtract by 1 until age becomes 0 
	int steps =0;
	for(int i = 0; age > 0 ; i++){
	if(age%2==0){
	//Even number
	age = age / 2;
	} else {
	//odd number
	age = age -1;
	}
	steps++;
	}
	System.out.println("Number of steps required to make" + temp + " into 0 is "+ steps);
	}
}
	