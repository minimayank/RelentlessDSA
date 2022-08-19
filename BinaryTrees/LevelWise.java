import java.util.*;
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
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		//Your code goes here
        
        Queue<BinaryTreeNode<Integer>>pendingNodes=new ArrayDeque<>();
            pendingNodes.add(root);
        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer>temp=pendingNodes.poll();
            String s=temp.data+":";
            if(temp.left!=null){
                pendingNodes.add(temp.left);
                s+="L:"+temp.left.data+",";
            }
            else{
                s+="L:-1,";
            }
          
            if(temp.right!=null){
                pendingNodes.add(temp.right);
                s+="R:"+temp.right.data;
            }
            else{
                s+="R:-1";
            }
            System.out.println(s);
        
        }
	}
}
	
