package com.problem;
import java.util.ArrayList;

public class SubSequence {

	public static void main(String[] args) {
		
		System.out.println(getSS("abc"));
		System.out.println(getPer("abc"));

	}

	
	public static ArrayList<String> getSS(String str)
	{
		
		if(str.length()==0)
		{
			ArrayList<String> base = new ArrayList<String>();
			base.add("");
			return base;
		}
		char cc=str.charAt(0);
		String ros=str.substring(1);
		
		ArrayList<String> myResult=new ArrayList<String>();
		ArrayList<String> recResult = getSS(ros);
		for(int i=0;i<recResult.size();i++)
		{
			myResult.add(recResult.get(i));
			myResult.add(cc+recResult.get(i));
		}
		return myResult;
				
	}
	
	public static ArrayList<String> getPer(String str)
	{
		
		if(str.length()==0)
		{
			ArrayList<String> base = new ArrayList<String>();
			base.add("");
			return base;
		}
		char cc=str.charAt(0);
		String ros=str.substring(1);
		
		ArrayList<String> myResult=new ArrayList<String>();
		ArrayList<String> recResult = getSS(ros);
		for(int i=0;i<recResult.size();i++)
		{
			myResult.add(recResult.get(i));
			myResult.add(cc+recResult.get(i));
			if(recResult.get(i).equals(""))
			{
				continue;
			}
			myResult.add(recResult.get(i)+cc);
		}
		return myResult;
				
	}
}
