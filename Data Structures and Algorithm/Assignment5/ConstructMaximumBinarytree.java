
public class ConstructMaximumBinarytree {
	
	public TreeNode constructMaximumBinaryTree(int[] nums) {
        
	     return maxTree(nums,0,nums.length);
	    }
	    
	
	
	public TreeNode maxTree(int []nums,int start,int end){
	        
	        if(start == end)
	            return null;
	            
	        int index = 0;
	        int maxVal = Integer.MIN_VALUE;
	        
	        for(int i= start; i<end; i++){
	            if(nums[i] > maxVal){
	                maxVal = nums[i];
	                index = i;
	            }
	        }
	        
	        TreeNode root=new TreeNode(maxVal);
	        root.left = maxTree(nums,start,index);
	        root.right = maxTree(nums,index+1,end);
	        
	        return root;
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
	  

	  ConstructMaximumBinarytree tree = new ConstructMaximumBinarytree();
		
	
	     int[] arr = {3,2,1,6,0,5};
	       
	     TreeNode tr = tree.constructMaximumBinaryTree(arr) ;
	       
	     tree.PreOrder(tr);
	     
}

}
