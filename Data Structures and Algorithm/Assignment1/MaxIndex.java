
public class MaxIndex {
	
	
	public int maxIndex(int[] arr){
		
	if(arr == null || arr.length == 0)
			return -1;

        int max_val = arr[0];
        int maxValIndex = 0 ;
        
		
        for (int i = 0; i < arr.length; i++) 
		{
			if (max_val < arr[i]) 
			{
				max_val = arr[i];
				maxValIndex = i;
			}
			
		}
        return maxValIndex;
	}
	
	
	public static void main(String[] args) 
	{
		MaxIndex max = new  MaxIndex();
		
		int arr[] = new int[] { 3, 5, 6, 2, 1, 9};
		System.out.println("First maximum value's index is  :  " + max.maxIndex(arr));
} }
	


