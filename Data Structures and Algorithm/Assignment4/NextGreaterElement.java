import java.util.HashMap;
import java.util.Stack;


public class NextGreaterElement {
	
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		Stack<Integer> st = new Stack<Integer>();
		
		int[] ret = new int[nums1.length];
		 
		if(nums2.length != 0){
	           st.push(nums2[0]);
        }
		
		for(int i = 1; i< nums2.length;i++)
		{
		   while (!st.isEmpty() && st.peek() < nums2[i]) 
		   {
			  
			    hashMap.put(st.pop(), nums2[i]);
		   }
		   st.push(nums2[i]);
		}  
		
		while (!st.isEmpty())
		{
			   int top =  st.pop();
			   hashMap.put(top, -1);
			
	    }
		
		for(int i = 0; i < nums1.length; i++) {
            ret[i] = hashMap.get(nums1[i]);
        }
		
		
        return ret;
	}	
	

	
	public static void main(String[] args) {
		
		int[] nums1 ={2,4};
		int[] nums2 = {1,2,3,4};
		int[] res =nextGreaterElement(nums1,nums2);
		for(int i =0;i<res.length;i++)
		{
		  System.out.print(res[i] +" ");
		}
		
	}
	    
	}

