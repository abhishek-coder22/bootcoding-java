package com.bootcoding.java.old;

public class Person {
	public static void main(String []args){
    private String name ;
    private int age ;
    private long phoneno;
    void setPerson(String n,int a , long P) {
        name = n;
        age = a;
        phoneno = P;
    }
    void showPerson()
    {
        System.out.println("Name=" + name);
        System.out.println("Age="+ age);
        System.out.println("phone=" + phoneno);
    
}
}
}