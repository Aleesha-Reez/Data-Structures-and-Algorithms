import java.util.Stack;


public class BackSpaceCompare {
	
	public static boolean backspaceCompare(String S, String T) {
		
		Stack<Character> st1 = new Stack<Character>();
		Stack<Character> st2 = new Stack<Character>();
		
		for(char s :S.toCharArray())
		{
				if(s == '#'){
					if(!st1.isEmpty()){
						st1.pop();
					}
				}
				else
					st1.push(s);
		}
		
		for(char t :T.toCharArray())
		{
			if(t == '#'){
				if(!st2.isEmpty()){
					st2.pop();
				}
			}
			else
				st2.push(t);
		}
		
        StringBuffer sb1 = new StringBuffer();
        while (!st1.isEmpty()) {
            sb1.append(st1.pop());
        }
        
        StringBuffer sb2 = new StringBuffer();
        while (!st2.isEmpty()) {
            sb2.append(st2.pop());
        }
        
       
      
        return sb1.toString().equals(sb2.toString());
   
		
	}

	
	public static void main(String[] args) {
		
		String S = "ab##";
		String T = "c#d#";
		
		 boolean s =backspaceCompare( S,T);
		 System.out.println(s);
	
}
}