//package sumOfPairsClosestX;

public class duplicatesInDistanceK {

	
    public Integer duplicatesInKDistance(String str, int k) throws Exception {
    
        int flag =0;
	    int b = 0;
	    
	    if(str.length() == 0) {
			 throw new Exception("check if string is null");
	    }
	    
	  
	    
		char[] inp = str.toCharArray();
    	for(int i =0;i < k ;i++)
    	{
    		for (int j = i + 1; j < k; j++)
    		{
    		    if (inp[i] == inp[j])
    		    {
    		    	flag =1;
    		        break;
    		    }
    		    else b = 0;
    		}
    		if(flag ==1)
    		{
    			 b = 1;
 		    }
    		
    	}
      
        return b;
 } 
         
    public static void main(String[] args) throws Exception {
    	
    	duplicatesInDistanceK  d = new duplicatesInDistanceK ();
    
    	String str =  "ABACDEB";
    	
    	int res = d.duplicatesInKDistance(str,3);
    	if(res == 0)
    	{
    		System.out.println("False");
    	}
    	else if(res == 1)
    	{
    		System.out.println("True");
    	}
		
	}
}
