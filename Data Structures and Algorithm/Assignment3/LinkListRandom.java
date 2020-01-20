package Homework;

public class LinkListRandom {
	

    public static Node head;

    public  LinkListRandom(){
        head = null;
       

    }

    
     public void PrintList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
       
            System.out.println("Node data "+temp.val + "-> "+"Random pointer is pointing to "+temp.random.val);
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    
    
    
    public Node copyRandomList(Node head){
       if(head == null)
        return null;
    
        Node orig = head;
        Node copy = head;

        // create copies of original inside the main list
        while(orig != null){
            Node add = new Node(orig.val, orig.next, orig.random);
            add.next = orig.next;
            orig.next = add;
            orig = orig.next.next;
        }

      //  PrintList(head);
        // fix the random for the copy node we created
        orig = head;
        copy = head.next;
        while(orig != null){
        	
            copy.random = orig.random.next;
            
            if(copy.next == null)
                break;
            
            copy = copy.next.next;
            orig = orig.next.next;
        }

       PrintList(head);
        // break the copy out of original
        orig = head;
        copy = head.next;
        Node copyReturn = copy;
        
        while(orig != null){
        	
            orig.next = copy.next;
            orig = orig.next;
            
         
            if(orig != null){
   
            	copy.next = orig.next;
                copy = copy.next;
            }
            
        }
 
        return copyReturn;

    }
    
    public static void main(String[] args) {
    	
    	
    	LinkListRandom m = new LinkListRandom();
    	 Node one = new Node(1,null,null);
         Node two = new Node(2,null,null);
        // Node three = new Node(3,null,null);
        // Node four = new Node(4,null,null);

         one.next = two;
         // two.Next = three;
         //three.Next = four;

         one.random = two;
         two.random = two;
        // three.Random = two;
        // four.Random = three;
         head = one;
         
         
         Node node = m.copyRandomList(head);
         m.PrintList(node);
     
         
    }
}
