import java.util.ArrayList;
import java.util.List;


public class IncreasingBST {
	
	public List<TreeNode> list = new ArrayList<>();
	
    public TreeNode increasingBST(TreeNode root) {
    	
        inorderTraversal(root);
        
        if (list.size() == 0) return null;
        
        TreeNode res = list.get(0);
        TreeNode curr = res;
        
        for (int i=1; i<list.size(); i++) {
        	
            curr.right = list.get(i);
            curr.left = null;
            curr = curr.right;
        }
        
        curr.left = null;
        
        return res;
    }
    
    public void inorderTraversal(TreeNode root) {
        if (root == null) return;
        
        inorderTraversal(root.left);
        list.add(root);
        inorderTraversal(root.right);
    }
    
    public void PreOrder(TreeNode node){
		
		if (node == null) {
            return;
        }
		System.out.print(node.val +",");
        PreOrder(node.left);
        PreOrder(node.right);
	
	}
	
    
    public static void main(String[] args) {
    	
       IncreasingBST tree = new IncreasingBST();
   	   TreeNode root= new TreeNode(5);

        root.left = new TreeNode(3);
        root.right = new TreeNode(6);


        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
      
        root.right.right = new TreeNode(8);

        root.left.left.left = new TreeNode(1);
       
        root.right.right.left = new TreeNode(7);
        root.right.right.right = new TreeNode(9);
   	 
   	
       
    
        TreeNode t = tree.increasingBST(root);
    	tree.PreOrder(t);
		
	}

}
