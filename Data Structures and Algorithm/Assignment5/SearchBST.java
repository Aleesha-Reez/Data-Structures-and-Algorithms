
public class SearchBST {
	
	TreeNode root;
	
	public TreeNode searchBST(TreeNode root, int val) {
		
		TreeNode res = null;
        if(root == null)
			return null;
		
		if(root.val == val)
			    return root;
		
		if(root.val > val)
			     res=  searchBST(root.left,val);
			
		else
			if(root.val < val)
		         res =searchBST(root.right,val);
		     
		

		return res;
    
	
	}
	
	
	
	public static void main(String[] args) {
		
		SearchBST tree = new SearchBST();
	   	 TreeNode root= new TreeNode(4);

	        root.left = new TreeNode(2);
	        root.right = new TreeNode(7);


	        root.left.left = new TreeNode(1);
	        root.left.right = new TreeNode(3);
	        
	       
	       TreeNode tr = tree.searchBST(root,4) ;
	       
	       System.out.print(tr.val+" ");
	       System.out.print(tr.left.val+" ");
	       System.out.print(tr.right.val+" ");
	      
		
	}
}
