package com.Test;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	    
	    int N = sc.nextInt();
	    
	    int A [] = new int[N+1];
	    
	    for(int i=1; i<=N; i++) {
	    	
	        A[i] = sc.nextInt();
	    }
	    int K = sc.nextInt();
	    
	    notInArray( N,  A,  K);
	    sc.close();
	}
	

public static void notInArray(int N, int A[], int K) {
	
	
			int answer= 0;
	for (N = 0; N <= A.length; N++ ) {
		if(N <= K) {
	 answer =N+1;
		}
		 answer =N;
	
	}
	System.out.println(answer);

}
}