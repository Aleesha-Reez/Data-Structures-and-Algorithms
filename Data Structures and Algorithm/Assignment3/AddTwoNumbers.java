package Homework;

import java.util.Stack;



public class AddTwoNumbers {
	
 ListNode head;
	 
	 public AddTwoNumbers()
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
	 
	 
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		Stack<ListNode> s1 = new Stack<ListNode>();
		Stack<ListNode> s2 = new Stack<ListNode>();
		Stack<ListNode> res = new Stack<ListNode>();
		
		ListNode dummy = new ListNode(0);
		ListNode node = dummy;
		
		int sum = 0;
		
		while(l1 != null)
		{
			s1.push(l1);
			l1 = l1.next;
		}
		
		while(l2 != null)
		{
			s2.push(l2);
			l2 = l2.next;
		}
		
		while(!s1.empty() || !s2.empty()){
			
			if(!s1.empty()) 
				sum =sum + s1.pop().val;
			
			if(!s2.empty()) 
				sum =sum + s2.pop().val;
			
			res.push(new ListNode(sum % 10));
			
			sum = sum/10;
		}
		
		if(sum == 1)
			res.push(new ListNode(1));
		
		while(!res.empty()){
			
			node.next = res.pop();
			node = node.next;
		}
		
		return dummy.next;
	}
		
	
	public static void main(String[] args) {
		AddTwoNumbers list = new AddTwoNumbers();
		
	    ListNode head1  = new ListNode(7);
		head1.next = new ListNode(2);
	    head1.next.next = new ListNode(4); 
	    head1.next.next.next = new ListNode(3);
	 //   head1.next.next.next.next = new ListNode(0);
	    
	    ListNode head2  = new ListNode(5);
		head2.next = new ListNode(6);
	    head2.next.next = new ListNode(4); 
		
	    ListNode q =list.addTwoNumbers(head1,head2);
	    list.printList(q);

}
}
