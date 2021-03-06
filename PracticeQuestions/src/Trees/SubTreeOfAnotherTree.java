package Trees;

public class SubTreeOfAnotherTree {
	
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
	public boolean isSubtree(TreeNode root, TreeNode subRoot) {
		// Time Complexity : O(M * N)
	    if(root == null){
	        return subRoot == null;
	    }
	      
	    return  isSameTree(root,subRoot) ||
	      isSubtree(root.left,subRoot)  ||
	      isSubtree(root.right,subRoot);
      
  }
  
  public boolean isSameTree(TreeNode root, TreeNode subRoot) {
      
	     if(root == null && subRoot == null){
	         return true; // base case
	     }
	     if(root == null || subRoot == null){
	         return false;
	     }
	     if(root.val != subRoot.val){
	         return false;
	     }
	     
	     return isSameTree(root.left,subRoot.left) && isSameTree(root.right,                         subRoot.right);
  }
}
