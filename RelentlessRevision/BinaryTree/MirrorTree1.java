/*************************************************************
 
    Following is the Binary Tree node structure:

    class BinaryTreeNode 
    {
    
        int data;
        BinaryTreeNode left;
        BinaryTreeNode right;

        BinaryTreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

*************************************************************/

public class Solution {
	public static void mirrorTree(BinaryTreeNode node) {
		// Write your code here.
        if(node==null)return;
          
          BinaryTreeNode temp=node.left;
          node.left=node.right;
          node.right=temp;
          
          mirrorTree(node.left);
          mirrorTree(node.right);
  
      }
}
