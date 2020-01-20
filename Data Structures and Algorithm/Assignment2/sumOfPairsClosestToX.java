//package sumOfPairsClosestX;

public class sumOfPairsClosestToX {

	
	 public void closestPairSumClosestToX(Integer[] arr1, Integer[] arr2,int x) throws Exception {
		 
		 
		 
		 int diff = Integer.MAX_VALUE; 
		 int m = arr1.length; 
	     int n = arr2.length;
		 int sum =0;
		 int low=0;
		 int high = n-1;
		 int index_low = 0, index_high = 0; 
		
		 if(arr1 == null || arr2 == null) {
			 throw new Exception("array is null");
			}
			if(arr1.length == 0 || arr2.length == 0) {
				 throw new Exception("array is null");
		    }
			
	     while (low < m && high >=0) 
		 { 
	    	 
	    	 sum = arr1[low]+arr2[high];
			 int new_diff = Math.abs(arr1[low] + arr2[high] - x);
			
		      if(new_diff < diff)
	    	
				{
		        	index_low = low; 
		            index_high = high; 
					diff = new_diff;
				}
		  
		      if(sum >x)
		               high--; 
		           else  
		               low++; 
		 } 
			
		        System.out.print("The closest pair is [" + arr1[index_low] + 
		                         ", " + arr2[index_high] + "]"); 
} 
			 
		 
	 
	
		 public static void main(String args[]) throws Exception 
		    { 
			 sumOfPairsClosestToX ob = new sumOfPairsClosestToX(); 
		        Integer ar1[] = {5, 6, 8, 10, 24}; 
		        Integer ar2[] = {12, 15, 20, 25, 30}; 
		     
		        int x = 51; 
		        ob.closestPairSumClosestToX(ar1, ar2,x); 
		    } 
		 
		 }