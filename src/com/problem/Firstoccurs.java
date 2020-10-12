package com.problem;

public class Firstoccurs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,23,4,5,1,5};
		System.out.println(firstOccurence(arr, 0, 4));
		String s="q";
		

	}
	
	public static int firstOccurence(int arr[],int si,int data)
	{
		if(si==arr.length)
		{
			return -1;
		}
		if(arr[si]==data)
		{
			return si;
		}else {
			int restAns=firstOccurence(arr,si+1,data);
			return restAns;
		}
	}

}
