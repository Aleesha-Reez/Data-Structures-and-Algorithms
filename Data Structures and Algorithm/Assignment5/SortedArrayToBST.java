import java.util.LinkedList;
import java.util.Queue;


public class SortedArrayToBST {
	
	public TreeNode root;
	
	public TreeNode sortedArrayToBST(int[] nums) {
		
		int start = 0;
		int end = nums.length-1;
		
		if(nums == null || nums.length == 0)
			return null;
		return buildBST(nums,start,end);
		
	}
	
	public static TreeNode buildBST(int[] nums, int start , int end){
		
		if (start > end) { 
            return null; 
        } 
 
		int mid = (start +end)/2;
		
		
        TreeNode node = new TreeNode(nums[mid]); 
        node.left = buildBST(nums,start,mid -1); 
        node.right = buildBST(nums, mid + 1, end); 
          
        return node;
			
		}
	
	
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

	
		
	public static void main(String[] args) {
		
		SortedArrayToBST st = new SortedArrayToBST();
		
		int[] nums = {-10,-3,0,5,9};
		TreeNode root = st.sortedArrayToBST(nums);
		st.levelOrder(root);
		
		
	}
		
	    
	}
	
	


