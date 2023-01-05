package com.bootcoding.java.old;//7) WAP that reads 5 numbers and counts the number of //positive numbers
//and negative numbers.
//Test Data :
//Input the first number: 5
//Input the second number: -4
//Input the third number: 10
//Input the fourth number: 15
//Input the fifth number: -1
//Expected Output:
//Number of positive numbers: 3
//Number of negative numbers: 2

class P7 {
	 public static void main(String[] args)
    {
        int countP=0;
        int countN=0;
        int [] arr={5,-4,10,15,-1};
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]>0)
            {
                countP++;
            }
            else
            {
                countN++;
            }
        }
    System.out.println("Number of positive numbers: "+countP);
    System.out.println("Number of positive numbers: "+countN);

    }
}
	
	//public static void main(String []args){
	//int count = 0;
	//int positive=0;
	//int negative=0;  
	//int data = 0;
	//while(data !=0)
	//{
	//if (data < 0){
   // negative++;
   // }else if (data > 0){
   // positive++;
   // }
    //count++;
  //}
   // System.out.println(positive + " positive numbers !");	
   // System.out.println(negative + " negative numbers !");
    
 
 
 