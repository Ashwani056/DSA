package com.problem;

public class Factorial {
	
	public static void main(String[] args) {
		
		System.out.println(Fact(4));
		
	}
	
	public static int Fact(int n) {
		
		if(n==1)
		{
			return 1;
		}
 		int f=Fact(n-1);
		int fn=f*n;
		return fn;
		
	}

}
