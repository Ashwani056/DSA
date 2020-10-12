package com.problem;

import java.util.ArrayList;

public class Permutation {

	public static void main(String[] args) {
		
		System.out.println(getPermutations("abc" ));

	}
	
	public static ArrayList<String> getPermutations(String str)
	{
		
		if(str.length()==0)
		{
			ArrayList<String> br =new ArrayList<String>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		
		ArrayList<String> rr =getPermutations(ros);
		ArrayList<String> mr = new ArrayList<>();
		for(String rrs:rr)
		{
			for(int i=0;i<=rrs.length();i++)
			{
				String val =rrs.substring(0,i)+ch+rrs.substring(i);
				mr.add(val);
			}
		}
		
		return mr;
	}

}
