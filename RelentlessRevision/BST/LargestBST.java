/*************************************************************************

    Following is the class structure of the Node class:

	class TreeNode<T> {
	    public T data;
	    public TreeNode<T> left;
	    public TreeNode<T> right;

	    TreeNode(T data) {
	        this.data = data;
	        left = null;
	        right = null;
	    }
	}

*************************************************************************/

public class Solution {
	public static int largestBST(TreeNode<Integer> root) {
		// Write your code here.\
        if(root==null)return 0;
        if(isBST(root))return height(root);
        else{
            int lh=largestBST(root.left);
            int rh=largestBST(root.right);
            return Math.max(lh,rh);
	}}
    public static int height(TreeNode<Integer>root){
        if(root==null)return 0;
        else{
            return 1+Math.max(height(root.left),height(root.right));
        }
    }
    public static int leftMax(TreeNode<Integer>root){
        if(root==null)return Integer.MIN_VALUE;
        else{
            return Math.max(root.data,Math.max(leftMax(root.left),leftMax(root.right)));
        }
    }
    public static int rightMin(TreeNode<Integer>root){
        if(root==null)return Integer.MAX_VALUE;
        else{
            return Math.min(root.data,Math.min(rightMin(root.left),rightMin(root.right)));
        }
        
    }
    public static boolean isBST(TreeNode<Integer>root){
        if(root==null)return true;
        else{
            int leftMax=leftMax(root.left);
            int rightMin=rightMin(root.right);
            if(leftMax>root.data)return false;
            if(rightMin<root.data)return false;
            if(isBST(root.left)&&isBST(root.right)){
                return true;
            }
            return false;
        }
    }
}
