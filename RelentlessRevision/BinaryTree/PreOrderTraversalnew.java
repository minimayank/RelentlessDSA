
/*******************************************************
Following is the BinaryTreeNode class structure

class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;
    
    public BinaryTreeNode(T data) {
        this.data = data;
    }
}
*******************************************************/
import java.util.ArrayList;

public class Solution {
    public static void preOrder(BinaryTreeNode<Integer> root,ArrayList<Integer>ans){
        if(root==null)return;
        else{
            ans.add(root.data);
            preOrder(root.left,ans);
            preOrder(root.right,ans);
        }
    }
    
	public static ArrayList<Integer> preorderTraversal(BinaryTreeNode<Integer> root) {
		// Write your code here
        if(root==null)return new ArrayList<Integer>();
        else{
            ArrayList<Integer>ans=new ArrayList<>();
            preOrder(root,ans);
             return ans;
        }
       
	}
}
