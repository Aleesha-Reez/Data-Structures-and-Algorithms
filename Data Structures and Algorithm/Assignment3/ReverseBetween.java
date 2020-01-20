package Homework;

public class ReverseBetween {
 static ListNode head;
	 
	 public  ReverseBetween()
	 {
		 head = null;
	 }
	 
	 
	 
	
public ListNode reverseBetween(ListNode head, int m, int n) {
	
	  ListNode helper = new ListNode(0);
      helper.next = head;

        
        ListNode current = helper;
        for (int i = 1; i < m; i++) {
        	
           current = current.next;
        }

    
        ListNode prev = null;
        ListNode temp = current.next;
        
        while (temp != null && (m <= n)) {
        	
            ListNode nextNode = temp.next;
            temp.next = prev;
            prev = temp;
            
            temp = nextNode;
            m++;
        }

     
        current.next.next = temp;
        current.next = prev;

        return helper.next;
	 
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
	
	ReverseBetween list = new ReverseBetween();
	ListNode head  = new ListNode(1);
	head.next = new ListNode(2);
    head.next.next = new ListNode(3); 
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5); 
  //  head.next.next.next.next.next = new ListNode(19); 
 //   head.next.next.next.next.next.next = new ListNode(10); 
  
    
    ListNode ques9 =list.reverseBetween(head, 2, 4);
    list.printList(ques9);
}
}
