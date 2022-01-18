package com.greatlearning.function;

public class DescendingSort {
	
	static int partitionDesc(double[] arr, int low, int high)  {  
		   
		double pivot = arr[high];  
	    int i = (low - 1);  
	    for (int j = low; j <= high - 1; j++) {  
	        if (arr[j] > pivot)  {  
	            i++;  
	            double t = arr[i];  
	            arr[i] = arr[j];  
	            arr[j] = t;  
	        }  
	    }  
	   
	    double t = arr[i+1];  
	    arr[i+1] = arr[high];  
	    arr[high] = t;  
	    return (i + 1);  
	}
	
	public static void quickDesc(double[] arr, int low, int high){  
	    
		if (low < high) {  
	       
			int p = partitionDesc(arr, low, high);  
	        quickDesc(arr, low, p - 1);  
	        quickDesc(arr, p + 1, high);  
	    }  
	}    
	
}
