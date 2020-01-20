
public class TargetSumIndex {

		public int[] twoSum(int[] nums, int target) throws Exception{
			
		int sum = 0;
		int index1= 0;
   	    int index2= 0;
   	    
   	    if(nums.length == 0) {
		 throw new Exception("check if array is null");
         }
 
		for(int i = 0; i< nums.length ;i++)
		{
			for(int j = i+1; j< nums.length ;j++)
			{
		      
		         sum = nums[i] + nums[j];
		         if( sum == target)
		         {
		        	  index1 = i;
		        	  index2 =j;
		        	  return new int[] {index1, index2};
		         }
		     }
	     }
	
		return new int[] {index1, index2};
		}
		
		
		public static void main(String[] args) throws Exception{
			
			TargetSumIndex tar = new TargetSumIndex();
			int arr[] = new int[] { 2, 7, 11, 15 };
			int target = 9;
		    int[] indices = tar.twoSum(arr,target);
		   
			System.out.println("Indices of numbers that add to the target " + target  +" is "  +indices[0] +" and " +indices[1]);;
		}
			
}
