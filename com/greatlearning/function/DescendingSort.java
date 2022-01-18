package com.greatlearning.function;

public class DescendingSort {
	
	static int partitionDesc(double[] arr, int start, int end)  {  
		   
		double pivot = arr[end];  
	    int i = (start - 1);  
	    for (int j = start; j <= end - 1; j++) {  
	        if (arr[j] > pivot)  {  
	            i++;  
	            double t = arr[i];  
	            arr[i] = arr[j];  
	            arr[j] = t;  
	        }  
	    }  
	   
	    double t = arr[i+1];  
	    arr[i+1] = arr[end];  
	    arr[end] = t;  
	    return (i + 1);  
	}
	
	public static void quickDesc(double[] arr, int start, int end){  
	    
		if (start < end) {  
	       
			int p = partitionDesc(arr, start, end);  
	        quickDesc(arr, start, p - 1);  
	        quickDesc(arr, p + 1, end);  
	    }  
	}    
	  
}
