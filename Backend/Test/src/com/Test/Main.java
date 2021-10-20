package com.Test;

import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {

        
        System.out.println(numVowels("billy bob"));
    
    }
    
    public static int numVowels(String word){
           
        int count  = 0;

        char[] words = word.toCharArray();

        for(char c : words){
            if(c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ){
            count++;
        }
        }
          return count;
           
    }
    
}