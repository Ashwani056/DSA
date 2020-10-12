package com.problem;

import java.util.ArrayList;

public class SubSeq {

	public static void main(String[] args) {

		
		System.out.println(getSS("abc"));
	}
	
	public static ArrayList<String> getSS(String str)
	{
		
		if(str.length()==0)
		{
			ArrayList<String> baseResult = new ArrayList<String>();
			baseResult.add("");
			return baseResult;
			
		}
		
		char cc = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> myResult=new ArrayList<String>();
		ArrayList<String> recResult=getSS(ros);
		System.out.println(recResult);
		
		for(int i=0;i<recResult.size();i++)
		{
			myResult.add(recResult.get(i));
			System.out.println(myResult);
			myResult.add(cc+recResult.get(i));
			System.out.println(myResult);
		}
		
		return myResult;
	}

}
