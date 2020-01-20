package Homework;

public class MiddleNode {
	
	 ListNode head;
	 
	 public  MiddleNode()
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
	 
	 
	
public ListNode middleNode(ListNode head) {
	
	 ListNode slow = head;
	 
	 ListNode fast = head;
	 
     while (fast != null && fast.next != null) {
    	 
         slow = slow.next;
         
         fast = fast.next.next;
     }
     
     return slow;
       
    }


public static void main(String[] args) {
	MiddleNode list = new MiddleNode();
	ListNode head  = new ListNode(1);
	head.next = new ListNode(2);
    head.next.next = new ListNode(3); 
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5); 
    head.next.next.next.next.next = new ListNode(6); 
  //  head.next.next.next.next.next.next = new ListNode(7);
  //  head.next.next.next.next.next.next.next = new ListNode(8);
     
  
    
    ListNode ques8 = list.middleNode(head);
    list.printList(ques8);
}
}
