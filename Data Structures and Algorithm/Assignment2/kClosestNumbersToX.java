
public class kClosestNumbersToX {

	public static Integer ceilingSortedArray(Integer[] arr, Integer start,Integer end, Integer num)
	{
		
		 if(num < arr[start]){
             return start;
         }

         if(num > arr[end]){
             return -1;
         }
         
		int mid;
		
		mid =(start+end)/2;
		
		if(arr[mid] == num)
		{
			System.out.println(num);
		    return mid;
		}
		
		if(num > arr[mid])
		{
			
			  if( mid +1 <= end  && num < arr [mid +1]){
	                return mid +1;
	            }else{
	                return ceilingSortedArray(arr, mid+1,end,num);
	      
		        }
		}	
		else{
			
		       if( mid -1 >=start  && num >arr [mid -1]){
		                return mid ;
		        }
		        else{
		                return ceilingSortedArray(arr,start,mid -1,num);
		        }
		}  
		
		
	}
	
	public static void  kClosestNumbersToNumberX(Integer[] arr,Integer num,Integer k, Integer size) throws Exception
	{
	
	   /*for(int c =0;c<arr.length;c++)
	   {
		    if(arr[c] == num)
			 throw new Exception(" Give a number which is not in the array");
		
	    }*/
		if(arr.length == 0 || num <= 0 ) {
			 throw new Exception("check if array is null or the number is less than 0");
	    }
	 
		int c = 0;
		 c = ceilingSortedArray(arr,0,size-1,num); 
		
		/*for(int d =0;d<arr.length;d++)
		   {
			    if(arr[d] == num)
				 throw new Exception(" Give a number which is not in the array");
			
		    }*/
		
	    int count = 0; 
	 
	    if (arr[c] == num){
              c--; 
      
        }
	 
	 
        int right = c+1;   

        while (c >= 0 && right < size && count < k) 
        { 
        	
            if (num - arr[c] < arr[right] - num) 
                System.out.print(arr[c--]+" "); 
            else
                System.out.print(arr[right++]+" "); 
                count++; 
        } 
  
        while (count < k && c >= 0) 
        { 
            System.out.print(arr[c--]+" "); 
            count++; 
        } 
  
  
        while (count < k && right < size) 
        { 
            System.out.print(arr[right++]+" "); 
            count++; 
        } 
		
	}
	
	
	
	
	
	public static void main(String[] args) throws Exception {
		
		Integer[] arr1 = {5, 6, 8, 10,12, 21, 24,25,32,37,45,51 };
		
		Integer size = arr1.length;
		
		 kClosestNumbersToNumberX(arr1,21,4,size);
	  
	
	}
}
