import java.util.LinkedList;
import java.util.Queue;


public class InvertTree {
	
	public TreeNode root;
	
	
	public void levelOrder(TreeNode root){
        if(root == null)
            return;

        // Take a queue and enqueue root and null
        // every level ending is signified by null
        // since there is just one node at root we enqueue root as well as null
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        
        while(queue.size() != 0){
            
           TreeNode node = queue.remove();
            // If the node is not null print it and enqueue its left and right child 
            // if they exist
            if(node != null){
            	
                System.out.print(node.val + " ,");
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }else{
                // We have reached a new level 
                // Check is queue is empty, if yes then we are done 
                // otherwise print a new line and enqueue a new null for next level
                System.out.println();
                if(queue.size() == 0)
                    break;
                queue.add(null);
            }
        }
    }

	
	public TreeNode invertTree(TreeNode node)
	{
		if(node == null)
			return null;

		//post order
		invertTree(node.left);
		invertTree(node.right);
		
		//swap
		TreeNode temp = node.left;
		node.left = node.right;
		node.right = temp;
		
		return node;
		
		
	}


	public static void main(String[] args) {
		
		InvertTree tree = new InvertTree();
		TreeNode root= new TreeNode(4);

        root.left = new TreeNode(7);
        root.right = new TreeNode(2);


        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(6);
      
        root.right.right = new TreeNode(1);
        root.right.left = new TreeNode(3);
        
        
        System.out.println("Before inverting tree");
		tree.levelOrder(root);
        TreeNode t = tree.invertTree(root);
       
        System.out.println();
        System.out.println("After inverting tree");
		tree.levelOrder(t);
	}

}
