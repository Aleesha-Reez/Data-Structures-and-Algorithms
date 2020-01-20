import java.util.Stack;


public class MyQueue {
	
	
	
	    Stack<Integer> s1;
		Stack<Integer> s2;
		
		
	    public MyQueue() {
	        s1 = new Stack<Integer>();
				s2 = new Stack<Integer>();
	        
	    }
	    
	    /** Push element x to the back of queue. */
	    public void push(int x) {
	        System.out.println("pushing" +s1.push(x));
	    }
	    
	    /** Removes the element from in front of queue and returns that element. */
	    public int pop() {
	        
	           if(s1.size() == 0 )
	               return 1;
	        
	           if(s1.size() == 0 )
		            return Integer.MIN_VALUE;
		        
		        while(s1.size() > 0){
		            s2.push(s1.pop());
		        }
		        int retVal = s2.pop();

		         while(s2.size() > 0){
		            s1.push(s2.pop());
		        }
		         System.out.println("popping " +retVal);
		        return retVal;
	    }
	    
	    /** Get the front element. */
	    public int peek() {
	        if(s1.size() == 0 )
	            return Integer.MIN_VALUE;
	        
	        while(s1.size() > 0){
	            s2.push(s1.pop());
	        }
	        int front = s2.peek();
	        while(s2.size() > 0){
	            s1.push(s2.pop());
	        }
	        System.out.println("peak is " +front);
	         
	        return front;
	        
	    }
	    
	    /** Returns whether the queue is empty. */
	    public boolean empty() {
	        
	        
	        if(s1.size() == 0){
	            return true;
	        }
	        return false;
	        
	    }


	/*public void push(int x) {
		System.out.println("pushing" +s1.push(x));
		
	}

	
	public int pop() {
		
		 if(s1.size() == 0 )
	            return Integer.MIN_VALUE;
	        
	        while(s1.size() > 0){
	            s2.push(s1.pop());
	        }
	        int retVal = s2.pop();

	         while(s2.size() > 0){
	            s1.push(s2.pop());
	        }
	         System.out.println("popping " +retVal);
	        return retVal;
	}

	
	public int peek() {
	    
		if(s1.size() == 0 )
            return Integer.MIN_VALUE;
        
        while(s1.size() > 0){
            s2.push(s1.pop());
        }
        int front = s2.peek();
        System.out.println("peak is " +front);
         
        return front;
	}

	
	public boolean empty() {
		return s1.isEmpty();
	    
	}
	*/
public static void main(String[] args) {
	
	MyQueue queue = new MyQueue();
	queue.push(1);
	queue.push(2); 
	queue.push(3); 
	queue.push(4); 
	queue.pop();  
	queue.push(5); 
	queue.peek();  
	//queue.pop();   
	queue.empty(); 
}

}
