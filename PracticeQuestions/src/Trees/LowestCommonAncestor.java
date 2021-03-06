package Trees;

public class LowestCommonAncestor {
	
	 //	 Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
	  
	  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		  	// Time Complexity: O(h). 
	        TreeNode smallest = lca(root, p, q);
	        return smallest;
	        
	  }
	  
	  public TreeNode lca(TreeNode root, TreeNode x, TreeNode y){
	        
	        if (root == null)
	            return null;
	  
	        // If both x and y are smaller than root, then LCA lies in left
	        if (root.val > x.val && root.val > y.val)
	            return lca(root.left, x, y);
	  
	        // If both x and y are greater than root, then LCA lies in right
	        if (root.val < x.val && root.val < y.val)
	            return lca(root.right, x, y);
	  
	        return root;
	  }

}
