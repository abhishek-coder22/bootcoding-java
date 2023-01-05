package com.bootcoding.java.old; //Count the total number of words in a string using split //method of string by space
 
class P10{
	public static void main(String[]args){
	String content = "Nature is a British weekly scientific journal founded and based in London, England. As a multidisciplinary publication, Nature features peer-reviewed research from a variety of academic disciplines, mainly in science and technology";
	String[]words=content.split(" ");
	//String text = String.join(" , " , words);	
	int i = 0;
	int count = 0;
	for(i=1; i<=words.length; i++)
		count ++;
	System.out.println(count);
	}
	}