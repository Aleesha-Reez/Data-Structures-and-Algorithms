
public class OptimizeQueue {
	
	 Node head;
	 Node tail;
	 
	 public class Node{

			
		    public int data;
		    public Node Next ;
		  

		    public Node(int data){
		        this.data = data;
		        this.Next = null;
		    }
		    
		}

	 
	 public OptimizeQueue(){
	        head = null;
	        tail = null;

	    }

	
	public void add(int data) {
		
		 Node add = new Node(data);

	        if(head == null){
	            head = add;
	            tail = add;
	            return;
	        }
	        add.Next = head;
	        head = add;

	}
	public int poll() {
		
		 if(head == null)
	           // return default(T);
	        	return 0;
	        if(head == tail){
	            int value = head.data;
	            head = null;
	            tail = null;
	            return value;
	        }

	        Node temp = head;
	        while(temp.Next != tail){
	            temp = temp.Next;
	        }
	        int val = tail.data;
	        temp.Next = null;
	        tail = temp;
	        return val;


	}
	public int getCount() {
		
		 int count = 0;
	        if(head == null)
	            return count;
	        Node temp = head;
	        while(temp != null){
	            temp = temp.Next;
	            count ++;
	        }
	        return count;

	}
	
	 public static void main(String[] args) {
			
			
		 OptimizeQueue queueInt = new OptimizeQueue();
		    queueInt.add(5);
		    queueInt.add(7);
		    queueInt.add(3);
		    queueInt.add(2);
		    queueInt.add(1);
		    
		 
		    
		    int dequeue = queueInt.poll();
		    System.out.println("pulling out"+dequeue);

		    int count = queueInt.getCount();
		    System.out.println("count is "+count);


		    }

}
