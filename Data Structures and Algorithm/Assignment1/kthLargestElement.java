
public class kthLargestElement {
	
	
	int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int wall = (low-1); 
        for (int i=low; i<high; i++) 
        { 
           
            if (arr[i] < pivot) 
            { 
                wall++; 
                swap(arr,wall,i);
         
            } 
        } 
        swap(arr,wall+1,high);
        return wall+1; 
    } 
	
	
  
	int findKthLargest(int arr[], int low, int high, int k) 
    { 
        if (low < high) 
        { 
        	
            int pi = partition(arr, low, high); 
            if(pi == (arr.length -k))
            {
            	System.out.println("kth largest element is " +arr[pi]);
            	return arr[pi];
            	
            }
            findKthLargest(arr, low, pi-1,k); 
            findKthLargest(arr, pi+1, high,k); 
        } 
        return 0;
    } 
  
	

	void swap(int arr[], int i, int j) 
    { 
        int temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp; 
    } 
  
   
    public static void main(String args[]) 
    { 
        int arr[] = {3, 2, 3, 1, 2, 4, 5, 5, 6}; 
        int n = arr.length; 
  
        kthLargestElement ob = new kthLargestElement(); 
        ob.findKthLargest(arr, 0, n-1,4); 
     
    } 

}
