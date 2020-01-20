package Homework;

public class RemoveNthFromEnd {
 static ListNode head;
	 
	 public  RemoveNthFromEnd()
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


	
public ListNode removeNthFromEnd(ListNode head, int n) {
    	
	if(head == null)
        return null;
 
    ListNode fast = head;
    ListNode slow = head;
 
    for(int i=0; i<n; i++){
        fast = fast.next;
    }
 
  
    if(fast == null){
    	
        head = head.next;
        return head;
    }
 
    while(fast.next != null){
    	
        fast = fast.next;
        slow = slow.next;
    }
 
    slow.next = slow.next.next;
 
    return head;
}
    	 
    	

public static void main(String[] args) {
	RemoveNthFromEnd list = new RemoveNthFromEnd();
	ListNode head  = new ListNode(1);
	head.next = new ListNode(2);
    head.next.next = new ListNode(3); 
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5); 
   //  head.next.next.next.next.next = new ListNode(6); 
 //    head.next.next.next.next.next.next = new ListNode(7); 
     
     ListNode ques1 = list.removeNthFromEnd(head,2);
     list.printList(ques1);
}
}