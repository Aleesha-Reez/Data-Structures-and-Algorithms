import java.util.LinkedList;
import java.util.List;


public class InOrderTraversal {
	
	public List<Integer> inorderTraversal(TreeNode root) {
	    
		return InOrder(root,new LinkedList<Integer>());
	}
	
	
	public List<Integer> InOrder(TreeNode root, List<Integer> list){
		
		if (root == null) {
            return new LinkedList<Integer>();
        }
		
		InOrder(root.left, list);
		list.add(root.val);
		InOrder(root.right, list);
		
		return list;
	}
	
	
	
	public static void main(String[] args) {
		 
		InOrderTraversal tree = new InOrderTraversal();
		TreeNode root= new TreeNode(1);
	
	     root.right = new TreeNode(2);
         root.right.left = new TreeNode(3);
         
         List<Integer> l = tree.inorderTraversal(root);
	     System.out.println(l);

}
	

}
