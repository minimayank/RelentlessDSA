public class DiameterOfABinaryTree{

  public static int height(BinaryTreeNode<Integer>root){
        if(root==null)return 0;
        else{
         return   1+Math.max(height(root.right),height(root.left));
        }

    }
  	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
		//Your code goes here
        if(root==null)return 0;

	    else{
            int possibility1=1+(height(root.left))+height(root.right);
            int possibility2=height(root.left);
            int possibility3=height(root.right);
            return Math.max(possibility1,Math.max(possibility2,possibility3));
         }
    }

}
