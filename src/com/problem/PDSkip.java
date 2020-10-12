package com.problem;

public class PDSkip {
	
	public static void main(String[] args) {
		
		Pdskip(5);
		
	}
	//print 5 3 1 2 4
	
	public static void Pdskip(int n)
	{
		if(n==0)
		{
			return;
		}
		if(n%2==1)
		{
			System.out.println(n);
		}
		Pdskip(n-1);
		if(n%2==0)
		{
			System.out.println(n);
		}
	}

}
