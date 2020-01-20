

 //package sumOfPairsClosestX;
 

public class removeDuplicatesNumbers {
	

	  public static  Integer removeDuplicates(Integer[] arr) throws Exception {
		  
		  int j = 0;
		  int n =arr.length;
		  
		  if(arr.length == 0) {
					 throw new Exception("check if array is null");
			    }
			 
		  for(int i=0; i < n-1; i++)
		  {
			  if(arr[i]!= arr[i+1])
			  {
			
				  arr[j] = arr[i];
				  j++;
			  }
			 
		  }
	
		 arr[j++] = arr[n-1]; 
		
	      return j; 
		  
		
	  } 
	  
	 
 
public static void main(String[] args) throws Exception {
	

	Integer[] arr = {0,0,1,1,1,2,2,3,3,4};
	for(int i =0;i< arr.length;i++)
	{
    
	 System.out.print(arr[i]+ " ");
	}
	int h = removeDuplicatesNumbers.removeDuplicates(arr);
	 System.out.print("\n"); 
	 System.out.println("The size of the new array without duplicates is "+h); 
	 for (int i=0; i<h; i++) 
         System.out.print(arr[i]+" "); 
	 
}	
	

}
	
   


