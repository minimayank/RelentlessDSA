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
        boolean ans=false;
        if(root==null)return false;
        if(root.data==x)return true;
        else{
       
              ans= isNodePresent(root.left,x);
               
              ans=isNodePresent(root.right,x);
            if(ans){
                return true;
            }
        }
        return false;
	}

}
