import java.util.Stack;


public class MinStack {
	
	Stack<Integer> main;
    static Stack<Integer> temp;

    public MinStack(){
    	
        main = new Stack<Integer>();
        temp = new Stack<Integer>();
    }

    public void Push(int x){
    	
    	main.push(x);
        if(temp.isEmpty())
        {
            temp.push(x);
        }
        else if(x <= temp.peek())
            temp.push(x);
    }

    
    
    
    public void Pop(){
    	
    	int maintop = main.peek();
    	if(!(main.isEmpty()))
    	        main.pop();
    	    
    	 if(!(temp.isEmpty()))
    	 {
    	        if(temp.peek() == maintop)
    	            temp.pop();
    	 }
     }

    
    
    public static int getMin(){
    	
    	 return temp.peek();
   }
    
    
    
    public int top() {
    	
    	 return main.peek();
    }
   
    
    
    public static void main(String[] args) {
    	
    	MinStack st = new MinStack();
    	st.Push(-2);
    	st.Push(0);
    	System.out.println(getMin());
    	st.Push(-3);
    	st.Push(5);
    	System.out.println(getMin());
    	st.Push(7);
    	System.out.println(getMin());
    	
    	
		
	}
}
