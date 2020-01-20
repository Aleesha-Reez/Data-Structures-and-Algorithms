package Homework;

public class DeleteNode {
	
	static ListNode head;
	 
	 public  DeleteNode()
	 {
		 head = null;
	 }
	 

	 //to display the list of nodes
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
	
	 
	 public void deleteNode(ListNode node ) {
		 
		
		 while(node.next!=null){
			
	            node.val = node.next.val;
	            
	            if(node.next.next != null){
	            	
	                node = node.next;
	                
	            }else{
	            
	                node.next = null;
	            }
	        }
	 }
		
	 
	 
	 public static void main(String[] args) {
			DeleteNode list = new DeleteNode();
			ListNode head  = new ListNode(4);
			head.next = new ListNode(5);
		    head.next.next = new ListNode(1); 
		    head.next.next.next = new ListNode(9);
		    head.next.next.next.next = new ListNode(2);
		   
		  
		    list.deleteNode(head.next.next.next);
		    list.printList(head);

}
}
