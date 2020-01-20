import java.util.LinkedList;
import java.util.List;


public class PostOrderTraversal {
	
	public List<Integer> postorderTraversal(TreeNode root) {
	    
		return postOrder(root,new LinkedList<Integer>());
	}
	
	
	public List<Integer> postOrder(TreeNode root, List<Integer> list){
		
		if (root == null) {
            return new LinkedList<Integer>();
        }
		postOrder(root.left, list);
		postOrder(root.right, list);
		list.add(root.val);
		return list;
	}
	
	
	
	public static void main(String[] args) {
		 
		PostOrderTraversal tree = new PostOrderTraversal();
		TreeNode root= new TreeNode(1);
	
	     root.right = new TreeNode(2);
         root.right.left = new TreeNode(3);
         
         List<Integer> l = tree.postorderTraversal(root);
	     System.out.println(l);

}
}
