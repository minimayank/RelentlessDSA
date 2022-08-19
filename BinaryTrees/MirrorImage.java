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

public class MirrorImage {

	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
		if(root==null)return;
        else{
            BinaryTreeNode<Integer>temp;
            mirrorBinaryTree(root.left);
            mirrorBinaryTree(root.right);
            temp=root.left;
            root.left=root.right;
            root.right=temp;
        }
    
        
	}
	
}
