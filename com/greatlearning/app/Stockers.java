package com.greatlearning.app;

	import java.util.Scanner;
	import com.greatlearning.function.AscendingSort;
	import com.greatlearning.function.DescendingSort;
	import com.greatlearning.function.Array;
	
public class Stockers {
		
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int n,i,True=0,False=0;
		
		System.out.println("Enter the no of companies ");
		n=sc.nextInt();
		
		int UserInput=0;
		
		double[] currentPrice = new double[n];
		boolean[] risenPrice = new boolean[n];
		for(i=0;i<n;i++) {
			
			System.out.println("Enter current stock price of the company "+(i+1));
			currentPrice[i]=sc.nextDouble();
			
			System.out.println("Whether company's stock price rose today compare to yesterday? (true/false) ");
			risenPrice[i]=sc.nextBoolean();
		}
	
		while(UserInput!=6) {
		
			System.out.println("\n--------------------------------------");
			System.out.println("Enter the operation you want to perform ");
			System.out.println("1. Display the companies stock prices in ascending order ");
			System.out.println("2. Display the companies stock prices in descending order ");
			System.out.println("3. Display the total no of companies for which stock prices rose today ");
			System.out.println("4. Display the total no of companies for which stock prices declined today ");
			System.out.println("5. Search a specific stock price ");
			System.out.println("6. Press 0 to exit ");
			System.out.println("--------------------------------------");
			
			UserInput=sc.nextInt();
			
			switch(UserInput) {
			
			case 1:
				System.out.println("Stock prices in ascending order:");
				AscendingSort.quickAsc(currentPrice,0,n-1);
				Array.pArray(currentPrice,n);
				break;
	       
	        case 2:
	        	System.out.println("Stock prices in descending order:");
	        	DescendingSort.quickDesc(currentPrice,0,n-1);
	        	Array.pArray(currentPrice,n);
	        	break;
	                
	        case 3:
	        	System.out.println("Total no of companies for which the stock price rose today:");
	        	for(i=0;i<n;i++) {	   
	        		if(risenPrice[i]==true)
	        			True++;
	        		}
	        	System.out.println(True);
	        	break;
	       
	        case 4:
	        	System.out.println("Total no of companies for which the stock price declined today:");
	        	for(i=0;i<n;i++) {
	        		if(risenPrice[i]==false)
	        			False++;
	        		}
	        	System.out.println(False);
	        	break; 
	                
	        case 5:
	        	System.out.println("Enter the key value: ");
	        	double key = sc.nextDouble();
	        	int result = Array.Search(currentPrice,n,key);
	        	if(result==-1)
	        		System.out.println("Value not found");
	        	else
	        		System.out.println("Stock of value "+key+" is present");
	        	break;
	       
	        case 6:
	        	System.out.println("Exited successfully");
	        	System.exit(1);
	}    


}
	
}
	
}
