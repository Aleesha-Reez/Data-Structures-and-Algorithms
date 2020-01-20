

public class pairsOfSmallestDifference {
	
	
   public static void  smallestPairDifference(int[] arr1,int[] arr2 ) throws Exception {
	
	 int diff = Integer.MAX_VALUE; 
	 int m = arr1.length; 
	
    
	 int low=0;
	 int high = 0;
	 int index_low = 0, index_high = 0; 
	
	 if(arr1 == null || arr2 == null) {
		 throw new Exception("check if array1 or array2 is null");
		}
		if(arr1.length == 0 || arr2.length == 0) {
			 throw new Exception("check if array1 or array2 is null");
	    }
	 
	
	 while (low < m && high >=0) 
	 { 
    	 
 
		 int new_diff = Math.abs(arr1[low] - arr2[high]);
		
	      if(new_diff < diff)
    	
			{
	        	index_low = low; 
	            index_high = high; 
				diff = new_diff;
			}
	  
	      if(arr1[low] < arr2[high])

	    	  low++;
	           else  
	               high--; 
	      
	 } 
		
	        System.out.println("The closest pair is [" + arr1[index_low] + 
	                         ", " + arr2[index_high] + "]"); 
	
   }
   
   public static void main(String args[]) throws Exception 
   { 
	
       int ar1[] = {5, 6, 8, 10, 24}; 
       int ar2[] = {12, 15, 20, 25, 30}; 
   
       smallestPairDifference(ar1, ar2); 
   } 

}
    	
	        
    	