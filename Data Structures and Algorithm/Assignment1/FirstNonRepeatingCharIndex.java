
public class FirstNonRepeatingCharIndex {

	
    public static int firstUniqChar(String s) {
    	
    	int size = s.length();
		int[] count = new int[255];
		int index= -1;
		
		for(int i = 0;i < size;i++){
			
			char st = s.charAt(i) ;
			count[st]++;
			
		}
		for(int i = 0; i < size; i++) {
            if(count[s.charAt(i)] == 1) 
		    { 
                 index = i; 
                 break; 
            } 
            
    	
    }
		return index;
    }
    
    
	public static void main(String[] args){
		
		
	    String str = "loveleetcode";
	    System.out.println("The index of the first non repeating character is " + firstUniqChar(str));
		
				
	}
}
			
			
			
	
