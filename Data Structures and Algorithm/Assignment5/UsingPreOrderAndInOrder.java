
public class UsingPreOrderAndInOrder {
	
	
	
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		
		if(preorder == null || inorder == null){
            return null;
        }
        return buildBST(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
    
	
	
	
    public TreeNode buildBST(int[] preorder, int preLeft, int preRight, int[] inorder, int inLeft, int inRight){
        
    	if( inLeft > inRight){
            return null;
        }
        
    	
        TreeNode root = new TreeNode(preorder[preLeft]);
        int rootIndex = rootIndex(inorder, preorder[preLeft]);
        
        root.left = buildBST(preorder, preLeft + 1, rootIndex - inLeft + 1, inorder, inLeft, rootIndex - 1);
        root.right = buildBST(preorder, preLeft + 1 + (rootIndex - inLeft) , preRight, inorder, rootIndex + 1, inRight);
        
        return root;
    }
    
    public int rootIndex(int[] inorder, int val){
        
        for(int i = 0; i < inorder.length; i++){
        	
            if(inorder[i] == val){
                return i;
            }
        }
        
        return -1;
    }
		
	    
	
	
	
public static void PreOrder(TreeNode node){
		
		if (node == null) {
            return;
        }
		System.out.print(node.val +",");
        PreOrder(node.left);
        PreOrder(node.right);
	
	}
	

	public static void main(String[] args) {
		
		UsingPreOrderAndInOrder tree = new UsingPreOrderAndInOrder();
		
		int[] preorder ={3,9,20,15,7};
		int[] inorder = {9,3,15,20,7};
		
		TreeNode t = tree.buildTree(preorder, inorder);
		PreOrder(t);
		
		
	}

}
