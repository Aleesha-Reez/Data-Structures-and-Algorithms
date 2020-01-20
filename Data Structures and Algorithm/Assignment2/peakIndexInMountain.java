
public class peakIndexInMountain {

	
	public  int peakIndexInMountainArray(Integer[] arr) throws Exception{
		
		int index =0;
		
		if(arr.length == 0) {
			 throw new Exception("check if array is null");
	    }
	 
		
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]>  arr[i+1])
			{
				
				index =i;
				System.out.println("Peak index is " +index);
				return index;
				
		     }
		}
		return index;
	}
	
	
	
	public static void main(String[] args) throws Exception {
		
		peakIndexInMountain t = new peakIndexInMountain();
		
		Integer[] arr ={0,2,1,0};
		
		t.peakIndexInMountainArray(arr);
		
	}
}
