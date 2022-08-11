import java.lang.*;
public class IsBST {
   public static int leftMax(BinaryTreeNode<Integer> root)//root.left
   {
       if(root==null)return Integer.MIN_VALUE;
      else{
          return Math.max(root.data,Math.max(leftMax(root.left),leftMax(root.right)));
      } 
       
   }
    public static int rightMin(BinaryTreeNode<Integer>root){
        if(root==null)return Integer.MAX_VALUE;
        else{
            return Math.min(root.data,Math.min(rightMin(root.left),rightMin(root.right)));
        }
    }
       public static boolean isBST(BinaryTreeNode<Integer> root) {
        if(root==null)return true;
        
        int leftMaxValue=leftMax(root.left);
        int rightMinValue=rightMin(root.right);
        if(root.data<leftMaxValue)return false;
        if(root.data>rightMinValue)return false;
        
        boolean isLeftSubTreeBST=isBST(root.left);
        boolean isRightSubTreeBST=isBST(root.right);
           
	    if(isLeftSubTreeBST&&isRightSubTreeBST)return true;
        else{
            return false;
        }
	}

}
