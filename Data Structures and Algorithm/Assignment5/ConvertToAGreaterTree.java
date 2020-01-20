
public class ConvertToAGreaterTree {
	
	int sum = 0;
	public TreeNode convertBST(TreeNode root) {
		if( root == null)
			return null;
		
		greaterTree(root);
		return root;
	}
	
	public void greaterTree(TreeNode root){
		
		if(root != null){
			greaterTree(root.right);
			sum += root.val;
			root.val = sum;
			greaterTree(root.left);
		}
		
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
		
		
		ConvertToAGreaterTree tree = new ConvertToAGreaterTree();
		
	   	 TreeNode root= new TreeNode(5);

	     root.left = new TreeNode(2);
	     root.right = new TreeNode(13);


	       
	     tree.convertBST(root) ;
	       
	     tree.PreOrder(root);
	      
		
	}
}


