package LinkedList;



public class SwapPairs {
	
	 static ListNode head;
	 
	 public SwapPairs()
	 {
		 head = null;
	 }
	 
	 public void addNewNode(int data) 
	 { 
	     
	   
		 ListNode node = new ListNode(data);
	     if(head == null)

			{
				head=node;
			}
			else
			{
				ListNode temp;
				temp = head;
				while(temp.next != null)
				{
					temp = temp.next;
				}

				temp.next = node;

			}
	 } 
	
	
	 public ListNode swapPairs(ListNode head) {
		 
		
	        ListNode current = head;
	        ListNode prev = null;
	        ListNode dummy = head.next;
	        
	        if (head == null || head.next == null) {
	            return head;
	        }


	        while (current != null && current.next != null) {

	            ListNode node1  = current;
	            ListNode node2 = current.next;

	            node1.next = node2.next;
	            node2.next = node1;

	           
	            if (prev != null) {
	                prev.next = node2;
	            }

	           
	            current = node2;
	            prev = current.next;
	            current = current.next.next;
	        }
	        
	        return dummy;
	    }
	 
	 public void printList(ListNode head)
	 {
		 ListNode temp;
		 temp = head;
		 while(temp != null)
			{
				System.out.print(temp.val +"->");
				temp = temp.next;
			}
		 System.out.print("NULL");
		
	 }
	 
	public static void main(String[] args) {
		
		SwapPairs list = new SwapPairs();
		
		ListNode head  = new ListNode(1);
		head.next = new ListNode(2);
        head.next.next = new ListNode(3); 
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5); 
        head.next.next.next.next.next = new ListNode(6); 
        
		ListNode ques2 = list.swapPairs(head);
		list.printList(ques2);
	     
         
	}
	        
	    	
	    	
	    	
	   
	    
}
