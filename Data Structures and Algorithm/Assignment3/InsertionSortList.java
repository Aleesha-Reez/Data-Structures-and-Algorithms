package Homework;

public class InsertionSortList {
	static ListNode head;
	ListNode newList = null;
	 
	 public InsertionSortList()
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

	
	public ListNode insertionSortList(ListNode head){
		
		ListNode temp = head;
	    ListNode deletedList;
	    
	    while(temp != null)
	    {
	    	deletedList = temp.next;
	    	sort(temp);
	    	temp = deletedList;
	    }
		return head = newList;
	}
	
	
	private ListNode sort(ListNode node)
	{
		ListNode temp = newList;
		
		if(newList == null || node.val <= newList.val){
			
			node.next = newList;
			newList = node;
		}
		
		else{
			
			while(temp.next != null && temp.next.val < node.val)
			{
				temp = temp.next;
			}
			
			node.next = temp.next;
			temp.next = node;
		}
		
		return newList;
		
		}
	

	  /*  ListNode temp = head;
	    ListNode current = head;

	   current = current.next;

	    while(current != null){

	       temp = head;
	    	//temp.next = temp;

	        while(temp != current){
	        	
	     
	            if (temp.val > current.val){

	                int d = current.val;
	                current.val = temp.val;
	                temp.val = d;

	            }else{

	                temp = temp.next;
	                }
	         }
       current = current.next;
	     }
	    
	    return head;
}
	*/
	public static void main(String[] args) {
		InsertionSortList list = new InsertionSortList();
		ListNode head  = new ListNode(4);
    	head.next = new ListNode(3);
        head.next.next = new ListNode(7); 
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(6); 
        head.next.next.next.next.next = new ListNode(1); 
        head.next.next.next.next.next.next = new ListNode(5); 
       
        ListNode ques6 = list.insertionSortList(head);
        list.printList(ques6);

}
}
