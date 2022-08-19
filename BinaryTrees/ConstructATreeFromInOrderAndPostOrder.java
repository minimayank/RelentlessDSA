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
import java.util.*;
public class Solution {
    
    public static BinaryTreeNode<Integer> buildTree(int[] postorder, int[] inorder) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        
        return buildTree(postorder,0,postorder.length-1,inorder,0,inorder.length-1,map);
        
        
    }
    
    public static BinaryTreeNode<Integer> buildTree(int[] postorder, int preStart, int preEnd, 
                                    int[] inorder, int inStart, int inEnd, Map<Integer,Integer> map){
        
        if(preStart > preEnd || inStart>inEnd){
            return null;
        }
        
        int nodeVal = postorder[preEnd];
        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(nodeVal);
        
        //get the index of the node in the inorder traversal to do the separation
        int elementIndex = map.get(nodeVal);
        int numberElements = elementIndex - inStart;
        
        newNode.left  = buildTree(postorder, preStart, preStart+numberElements-1, inorder, inStart, elementIndex-1, map);
        newNode.right = buildTree(postorder, preStart+numberElements, preEnd-1, inorder, elementIndex+1, inEnd, map);
        
        return newNode;
    }
    
    
    
	

}
