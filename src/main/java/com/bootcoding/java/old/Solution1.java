package com.bootcoding.java.old;

public class Solution1 {
	Public Static void main(String []args){
   // public int lengthOfLastWord(String s) {
        int len = 0;
        s = s.trim();
        for (int i = s.length() - 1; i >=0; i --){
            if (s.charAt(i) == ' '){
                break;
            }
            else{
                len ++;
            }
        }
        return len;
    }
}
