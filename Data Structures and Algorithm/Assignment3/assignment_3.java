package Homework;

public class assignment_3 {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x){
			this.val = x;
		}
	}

	//Q1
	/*
	Given a linked list, remove the n-th node from the end of list and return its head.
	Example:
	Given linked list: 1->2->3->4->5, and n = 2.
	After removing the second node from the end, the linked list becomes 1->2->3->5.
	*/
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
    }
    
    //Q2
    /*
     * Given a linked list, swap every two adjacent nodes and return its head.
		You may not modify the values in the list's nodes, only nodes itself may be changed.
		Example:
		Given 1->2->3->4, you should return the list as 2->1->4->3.
     */
    public ListNode swapPairs(ListNode head) {
        
    }
    
    //Q3
    /*
     * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
		Example 1:
		Input: 1->2->3->3->4->4->5
		Output: 1->2->5
		Example 2:
		
		Input: 1->1->1->2->3
		Output: 2->3
     */
    public ListNode deleteDuplicates(ListNode head) {
        
    }
    
    //Q4
    /*
     * Given a sorted linked list, delete all duplicates such that each element appear only once.
		Example 1:
		Input: 1->1->2
		Output: 1->2
		Example 2:
		
		Input: 1->1->2->3->3
		Output: 1->2->3
     */
    public ListNode deleteDuplicates(ListNode head) {
        
    }
    
    //Q5
    /*
     * A linked list is given such that each node contains an additional random pointer which could point to any node in the list or null.
		Return a deep copy of the list.
		Example 1:
		Input:
		{"$id":"1","next":{"$id":"2","next":null,"random":{"$ref":"2"},"val":2},"random":{"$ref":"2"},"val":1}
		
		Explanation:
		Node 1's value is 1, both of its next and random pointer points to Node 2.
		Node 2's value is 2, its next pointer points to null and its random pointer points to itself.
		Note:
		You must return the copy of the given head as a reference to the cloned list.
     */
    class Node {
        public int val;
        public Node next;
        public Node random;

        public Node() {}

        public Node(int _val,Node _next,Node _random) {
            val = _val;
            next = _next;
            random = _random;
        }
    }
    public Node copyRandomList(Node head) {
    	
    }
    
    //Q6
    /*
     * Sort a linked list using insertion sort.
		A graphical example of insertion sort. The partial sorted list (black) initially contains only the first element in the list.
		With each iteration one element (red) is removed from the input data and inserted in-place into the sorted list
		
		Algorithm of Insertion Sort:
		Insertion sort iterates, consuming one input element each repetition, and growing a sorted output list.
		At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list, and inserts it there.
		It repeats until no input elements remain.
		
		Example 1:
		Input: 4->2->1->3
		Output: 1->2->3->4
		Example 2:
		
		Input: -1->5->3->4->0
		Output: -1->0->3->4->5
     */
    public ListNode insertionSortList(ListNode head) {
        
    }
    
    //Q7
    /*
     * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
		Given linked list -- head = [4,5,1,9], which looks like following:
		Example 1:
		
		Input: head = [4,5,1,9], node = 5
		Output: [4,1,9]
		Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.
		Example 2:
		
		Input: head = [4,5,1,9], node = 1
		Output: [4,5,9]
		Explanation: You are given the third node with value 1, the linked list should become 4 -> 5 -> 9 after calling your function.
		 
		Note:
		The linked list will have at least two elements.
		All of the nodes' values will be unique.
		The given node will not be the tail and it will always be a valid node of the linked list.
		Do not return anything from your function.
     */
    public void deleteNode(ListNode node) {
        
    }
    
    //Q8
    /*
     * Given a non-empty, singly linked list with head node head, return a middle node of linked list.
		If there are two middle nodes, return the second middle node.
		Example 1:
		
		Input: [1,2,3,4,5]
		Output: Node 3 from this list (Serialization: [3,4,5])
		The returned node has value 3.  (The judge's serialization of this node is [3,4,5]).
		Note that we returned a ListNode object ans, such that:
		ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and ans.next.next.next = NULL.
		Example 2:
		
		Input: [1,2,3,4,5,6]
		Output: Node 4 from this list (Serialization: [4,5,6])
		Since the list has two middle nodes with values 3 and 4, we return the second one.
		 
		Note:
		The number of nodes in the given list will be between 1 and 100.
     */
    public ListNode middleNode(ListNode head) {
        
    }
    
    //Q9
    /*
     * Reverse a linked list from position m to n. Do it in one-pass.
		Note: 1 ≤ m ≤ n ≤ length of list.
		
		Example:
		Input: 1->2->3->4->5->NULL, m = 2, n = 4
		Output: 1->4->3->2->5->NULL
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {
        
    }
    
    //Q10
    /*
     * You are given two non-empty linked lists representing two non-negative integers.
       The most significant digit comes first and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

		You may assume the two numbers do not contain any leading zero, except the number 0 itself.
		Follow up:
		What if you cannot modify the input lists? In other words, reversing the lists is not allowed.
		Example:
		Input: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
		Output: 7 -> 8 -> 0 -> 7
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
    }
}
