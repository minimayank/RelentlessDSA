public class Solution {
	/*
	 * BinaryTreeNode class
	 * 
	 * class BinaryTreeNode<T> 
	 * { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 *		public BinaryTreeNode(T data) 
	 *		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
    static boolean ans=true;
    public static int minRight(BinaryTreeNode<Integer>root){
        if(root==null)return Integer.MAX_VALUE;
        else{
            int min=Math.min(root.data,Math.min(minRight(root.left),minRight(root.right)));
            return min;
        }
    }
    public static int maxLeft(BinaryTreeNode<Integer>root){
        if(root==null)return Integer.MIN_VALUE;
        else{
            int max=Math.max(root.data,Math.min(maxLeft(root.left),maxLeft(root.right)));
           return max;
        }
        
    }
	public static boolean isBST(BinaryTreeNode<Integer>root){
        if(root==null)return true;
        else{
        int maxLeft=maxLeft(root.left);
        int minRight=minRight(root.right);
        if(root.data<maxLeft){
            return false;
          }
        if(root.data>minRight){
            return false;
        }
        boolean ansL= isBST(root.left);
        boolean ansR=isBST(root.right);
        if(ansL&&ansR)return true;
       else  return false;
    }
    }
    public static int heightOfBST(BinaryTreeNode<Integer>root){
        if(root==null)return 0;
        else{
            return 1+Math.max(heightOfBST(root.left),heightOfBST(root.right));
        }
    }
	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		// Write your code here
        if(root==null)return 0;
        else{
            if(isBST(root)){
                return heightOfBST(root);
            
            }
            int lh=largestBSTSubtree(root.left);
            int rh=largestBSTSubtree(root.right);
          return Math.max(lh,rh);
        }
        
	}
    

}
