
import java.util.*; 


public class IntersectionOfTwoArrays {

	
	    public Integer[] intersection(Integer[] arr1, Integer[] arr2) throws Exception {
			
	    	if(arr1 == null || arr2 == null) {
	   		 throw new Exception("check if array1 or array2 is null");
	   		}
	   		if(arr1.length == 0 || arr2.length == 0) {
	   			 throw new Exception("check if array1 or array2 is null");
	   	    }
	   	 
			int index =0;
			int len =0;
		
		    HashSet<Integer> set1 = new HashSet<Integer>();
		    for(int i: arr1){
		         set1.add(i);
		    }
		 
		    HashSet<Integer> set2 = new HashSet<Integer>();
		    for(int i:arr2){
		        if(set1.contains(i)){
		            set2.add(i);
		        }
		    }
		 
		    if(set1.size() > set2.size())
		         len =set2.size();
		    else
		    	 len = set1.size();
		    
		
		    Integer[] result = new Integer[len];
		  
		    for(int i:set2){
		        result[index++] = i;
		       
		    }
		 
		    
		    for(int k =0;k < result.length;k++)
		    {
		    	System.out.println(result[k]);
		    }
		    return result;
		}
		
		
		
		  public static void main(String []args) throws Exception{
			  
			  IntersectionOfTwoArrays inter = new IntersectionOfTwoArrays();
		       
		        Integer myArray[] = {1,2,2,1,};
		        Integer myArray2[] = {2,2};
		        inter.intersection(myArray, myArray2);
		    }

	
}