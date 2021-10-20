package com.Test;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String inputText = sc.nextLine();
	    
	  
	    wordCount(inputText);
	    
	    sc.close();
	}
	

public static void wordCount(String input) {
	
    String inputs =input.toLowerCase();
    		
       
    String[] inputTextArr = inputs.split(" ");

	

	for(int i = 0; i<= inputTextArr.length-1 ; i++) {
		 int count = 1;
		  for(int j=i+1;j<inputTextArr.length-1;j++) //Inner loop for Comparison
	         {
			 
		   if(inputTextArr[i].equals(inputTextArr[j]))  //Checking for both strings are equal
			  
           {
			   count++; //if equal increment the count
			   inputTextArr[j]="0";
           }
	         }
		   if(count>1 &&inputTextArr[i]!="0")
			   System.out.println(inputTextArr[i]+": "+count); //if number is greater than one then print	 
		
		}
	}

	   
}
 


