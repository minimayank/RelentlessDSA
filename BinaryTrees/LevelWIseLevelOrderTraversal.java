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
		//Your code goes here    if(root==null)return;
        Queue<BinaryTreeNode<Integer>>pendingNodes=new ArrayDeque<>();
        pendingNodes.add(root);
        BinaryTreeNode<Integer>garbage=new BinaryTreeNode<>(Integer.MIN_VALUE);
        pendingNodes.add(garbage);
        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer>temp=pendingNodes.poll();
            if(temp==garbage){
                if(pendingNodes.isEmpty()){
                    return;
                }
                System.out.println();
                pendingNodes.add(garbage);
                continue;

            }
            System.out.print(temp.data+" ");
            if(temp.left!=null){
                pendingNodes.add(temp.left);
            }
            if(temp.right!=null){
                pendingNodes.add(temp.right);
            }
        }
	}
	
}
