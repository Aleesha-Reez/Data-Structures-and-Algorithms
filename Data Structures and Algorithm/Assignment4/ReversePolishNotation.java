import java.util.Stack;


public class ReversePolishNotation {
	
	public static int evalRPN(String[] tokens) {
		
        Stack<Integer> st = new Stack<Integer>();
		
		for(int i =0; i < tokens.length;i++)
		{
			
		
			    if(tokens[i].equals("+"))
				    st.push(st.pop()+st.pop());
			
			     else if(tokens[i].equals("-"))
			     {
			    	 int a = st.pop();
				     int b = st.pop();
			         st.push(b-a);
			     }
			     else if(tokens[i].equals("*"))
			    	 st.push(st.pop()*st.pop());
			
			     else if(tokens[i].equals("/"))
			     {
			    	 int a = st.pop();
				     int b = st.pop();
			         st.push(b/a);
			     }
                 else st.push(Integer.parseInt(tokens[i]));
			          
		      }
	    
		System.out.println(st);
		return st.pop();
    }

		
		/*for(int i =0; i < tokens.length;i++)
		{
			if (tokens[i] != "+" && tokens[i] != "-" && tokens[i] != "*" && tokens[i] != "/")
				st.push(Integer.parseInt(tokens[i]));
			
			else{
			    
			
			     if(tokens[i].equals("+"))
				    st.push(st.pop()+st.pop());
			
			     else if(tokens[i].equals("-"))
			     {
			    	 int a = st.pop();
				     int b = st.pop();
			         st.push(b-a);
			     }
			     else if(tokens[i].equals("*"))
			    	 st.push(st.pop()*st.pop());
			
			     else if(tokens[i].equals("/"))
			     {
			    	 int a = st.pop();
				     int b = st.pop();
			         st.push(b/a);
			     }
			          
		      }
	    }
		System.out.println(st.pop());
		return st.pop();*/

	
	public static void main(String[] args) {
		
		String[] st = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
		evalRPN(st);
				
		
	}

}
