package com.greatlearning.function;

public class Array {
	  
	public static void pArray(double[] arr, int n)  {  
		    int i;  
		    for (i = 0; i < n; i++)  
		        System.out.print("\t"+arr[i]);  
		}  
	public static int Search(double a[], int n, double value) {  
			
		  for (int i = 0; i < n; i++)  {  
		        if (a[i] == value)  
		        return i+1;  
		    }  
		  return -1;  
		}  
}