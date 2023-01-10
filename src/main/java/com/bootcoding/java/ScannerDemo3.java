package com.bootcoding.java;
import java.util.Scanner;
public class ScannerDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Maths Marks");
        int maths = scanner.nextInt();
        System.out.println("Enter Physics Marks");
        int physics = scanner.nextInt();
        System.out.println("Enter Chemistry Marks");
        int chemistry = scanner.nextInt();

        double percentage = calcPercentage(maths,physics,chemistry);
       double average = calcAverage(maths,physics,chemistry);
       char grade= calcGrade( percentage);

        System.out.printf("%.2f", percentage);
        System.out.println("Avg:"+average);
        System.out.println("Grade:"+grade);
        }
    public static double calcPercentage(int maths, int physics, int chemistry){
            double percentage = 0;
            double sum = maths + physics + chemistry ;
            percentage=sum/300*100;
            return percentage;
        }
        public static double calcAverage(int maths, int physics, int chemistry){
            double sum= maths + physics+ chemistry;
            sum = sum/3;
            return sum;
        }
              public static char calcGrade(double percentage){

                  if(percentage>=75){
                      return 'A';
                  }
                  if(percentage>=60){
                      return 'B';
                  }
                  return 'C';
              }
    }

