package com.problem;

public class Power {

	public static void main(String[] args) {
		
		System.out.println(power(2,4));
		

	}
	
	public static int power(int x,int n)
	{
		if(n==0)
		{
			return 1;
		}
		int pnb1=power(x,n/2);
		if(n%2==1)
		{
			return pnb1*pnb1*x;
		}
		else {
			return pnb1*pnb1;
		}
	}

}
