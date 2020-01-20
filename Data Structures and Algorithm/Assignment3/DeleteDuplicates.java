package Homework;

public class DeleteDuplicates {
	
	static ListNode head;
	 
	 public  DeleteDuplicates()
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


	public ListNode deleteDuplicates(ListNode head) {
		
    	ListNode current = head; 
    	
    	while(current != null & current.next != null){
    		
    		if(current.val == current.next.val){
    			
    			current.next = current.next.next;
    		}
    		else 
    			
    			current = current.next;
    	}
    	
      return head;
        
    }
    public static void main(String[] args) {
    	DeleteDuplicates list = new DeleteDuplicates();
		ListNode head  = new ListNode(1);
    	head.next = new ListNode(2);
        head.next.next = new ListNode(3); 
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4); 
        head.next.next.next.next.next = new ListNode(4); 
        head.next.next.next.next.next.next = new ListNode(5); 
      
        
        ListNode ques4 = list.deleteDuplicates(head);
        list.printList(ques4);
         

}
}