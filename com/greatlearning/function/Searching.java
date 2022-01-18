package com.greatlearning.function;

public class Searching {
	    
	
	public static int Search(double[] arr, int size, double value) {  
			
		  for (int i = 0; i < size; i++)  {  
		   
			  if (arr[i] == value)  
				  return i+1;  
		    }  
		  
		  return -1;  
		  
		}  
}
