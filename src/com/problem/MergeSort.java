package com.problem;

public class MergeSort {

	public static void main(String[] args) {
		
		int arr1[]= {10,20,30,40,50};
		int arr2[] = {5,15,30,45,60,70,80};
		int[] ans=mergeTwoSortedArrays(arr1, arr2);
		
		for(int a:ans)
		{
			System.out.println(a+" ");
		}
		

	}
	
	public static int[] mergeTwoSortedArrays(int arr1[],int arr2[])
	{
		int[] merged = new int[arr1.length + arr2.length];
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<arr1.length && j<arr2.length) {
			
			if(arr1[i]<=arr2[j])
			{
				merged[k]=arr1[i];
				i++;
				k++;
			}else {
				merged[k]=arr2[j];
				j++;
				k++;
			}
		} 
		if(i== arr1.length) {
			while(j<arr2.length) {
				merged[k]=arr2[j];
				j++;
				k++;
			}
		}
		if(j==arr2.length) {
			while(j<arr2.length) {
				merged[k]=arr2[j];
				i++;
				k++;
				}
		}
		
		return merged;
	}
	
	public static int[] mergeSort(int[] arr,int lo,int hi)
	{
		int mid = (lo+hi)/2;
		
		int[] fh = mergeSort(arr, lo, mid);
		int[] sh = mergeSort(arr,mid+1,hi);
		
		int[] merge= mergeTwoSortedArrays(fh, sh);
		return merge;
	}
	
}
