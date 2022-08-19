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

public class Solution {
    public static BinaryTreeNode<Integer> buildTree(int[] inOrder,int[] preOrder,int ins,int ine,int pres,int pree){
        if(ins>ine){
            return null;
        }
         BinaryTreeNode<Integer>root=new BinaryTreeNode<>(preOrder[pres]);
        int rootInIndex=-1;
        for(int i=ins;i<=ine;i++){
            if(inOrder[i]==root.data){
                rootInIndex=i;
                break;
            }
        }
        if(rootInIndex==-1)return null;
        
        int leftins=ins;
        int rightins=rootInIndex+1;
        int leftpres=pres+1;
        int leftine=rootInIndex-1;
        int rightine=ine;
        
        int leftpree=leftine-leftins+leftpres;
        int rightpree=pree;
        int rightpres=leftpree+1;
        
        
        root.left=buildTree(inOrder,preOrder,leftins,leftine,leftpres,leftpree);
        root.right=buildTree(inOrder,preOrder,rightins,rightine,rightpres,rightpree);
            return root;
        
    }

	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		//Your code goes here
        return buildTree(inOrder,preOrder,0,inOrder.length-1,0,preOrder.length-1);
	}

}
