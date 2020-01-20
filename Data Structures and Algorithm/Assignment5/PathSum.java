import java.util.ArrayList;
import java.util.List;


public class PathSum {
	
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		
		List<List<Integer>> path = new ArrayList<>();
		
		findPath(root,sum, new ArrayList<Integer>(), path);
		return path;
	    
	}

	public void findPath(TreeNode root,int sum, List<Integer> temp, List<List<Integer>> path){
		
		if(root == null)
			return;
		
		temp.add(root.val);
		
		if(root.val == sum && root.left == null && root.right == null){
			path.add(temp);
			return;
		}
		findPath(root.left,sum - root.val, new ArrayList<Integer>(temp), path);
		findPath(root.right,sum - root.val, new ArrayList<Integer>(temp), path);
	}


public static void main(String[] args) {
	
	PathSum tree = new PathSum();
	
	TreeNode root= new TreeNode(5);

    root.left = new TreeNode(4);
    root.right = new TreeNode(8);


    root.left.left = new TreeNode(11);
   
    root.right.left = new TreeNode(13);
    root.right.right = new TreeNode(4);

    root.left.left.left = new TreeNode(7);
    root.left.left.right = new TreeNode(2);
    root.right.right.right = new TreeNode(1);
    root.right.right.left = new TreeNode(5);
	 
	
   
   
    List<List<Integer>> l =  tree.pathSum(root,22);
    System.out.println(l);
    

}
}

