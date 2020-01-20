
public class moveAll1sToStart {
	
	
	public void move1sToStart(Integer[] arr) throws Exception {
		
	
		if(arr.length == 0) {
			 throw new Exception("check if array is null");
	    }
	 
		int pivot = 1;
		int low =0;
		
		
		int high = arr.length -1;
		while(low < high)
		{
			
		
		  if(arr[low] < pivot)
		  {
			Swap(arr,low,high);
		    high --;
	       }
		   else if(arr[low] == pivot){
				low++;
		   }
		}
	}
	
	  static void Swap(Integer[] arr, int i, int j){
          if(i<0 || i >= arr.length || j < 0|| j >= arr.length )
              return;

          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
          
      }
	  
	  public static void main(String[] args) throws Exception
		{
			
			moveAll1sToStart tar = new moveAll1sToStart();
		
			Integer arr[] = new Integer[] {1,0,1,0,0,0,1,0,1,1,0,1 };
			tar.move1sToStart(arr);
			for(int i =0;i<arr.length;i++){
				System.out.println(arr[i]);
			}
		 }

	  
}
