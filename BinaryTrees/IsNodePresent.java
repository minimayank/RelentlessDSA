/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/

public class Solution {

	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	    //Your code goes here
        if(root==null)return false;
        boolean ans=false;
        if(root.data==x){
            return true;
        }
        else{
            ans=isNodePresent(root.left,x);
            if(ans)return ans;
            ans=isNodePresent(root.right,x);
            if(ans)return ans;
        }
        return false;
	}

}
