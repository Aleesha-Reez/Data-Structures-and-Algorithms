package Homework;

public class DeleteAllDuplicates {
	
		 static ListNode head;
		 
		 public DeleteAllDuplicates()
		 {
			 head = null;
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

	 
	
	public ListNode deleteDuplicates(ListNode head) {
		
       ListNode temp = new ListNode(0); 
       temp.next = head; 
       ListNode prev = temp; 
       ListNode current = head; 
 
       while (current != null) 
       { 
           while (current.next != null && 
                  prev.next.val == current.next.val) 
                          current = current.next; 
 
           if (prev.next == current) 
               prev = prev.next; 
 
         
           else
               prev.next = current.next; 
 
           current = current.next; 
       } 
 
      
       head = temp.next; 
       return head;
	}

	
	public static void main(String[] args) {
		DeleteAllDuplicates list = new DeleteAllDuplicates();
		ListNode head  = new ListNode(1);
    	head.next = new ListNode(2);
        head.next.next = new ListNode(2); 
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4); 
        head.next.next.next.next.next = new ListNode(4); 
        head.next.next.next.next.next.next = new ListNode(5); 
       
        ListNode ques3 = list.deleteDuplicates(head);
        list.printList(ques3);
	}
}