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
        else{
          if(node.left==null&&node.right==null){
              return;
          }
          mirrorTree(node.left);
          mirrorTree(node.right);
          if(node.left!=null&&node.right!=null){
              BinaryTreeNode temp=node.left;
              node.left=node.right;
              node.right=temp;
          }
          else if(node.left==null){
              BinaryTreeNode temp=node.right;
              node.left=temp;
              node.right=null;
          }  
         else{
             BinaryTreeNode temp=node.left;
             node.right=temp;
             node.left=null;
         }
      }
	}
}
