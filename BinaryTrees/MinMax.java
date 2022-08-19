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



/*

	Representation of the Pair Class

	class Pair<T, U> {
		T minimum;
		U maximum;

		public Pair(T minimum, U maximum) {
			this.minimum = minimum;
			this.maximum = maximum;
		}

	}

*/

public class Solution {
   
	public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
		//Your code goes here
         int max_value=Integer.MIN_VALUE;
         int min_value=Integer.MAX_VALUE;
          if(root==null)return null;
        
        BinaryTreeNode<Integer>current=root,pre;
          
    while (current != null)
    {
        // If left child does nor exists
        if (current.left == null)
        {
            max_value = Math.max(max_value, current.data);
            min_value = Math.min(min_value, current.data);
             
            current = current.right;
        }
        else
        {
     
            // Find the inorder predecessor of current
            pre = current.left;
            while (pre.right != null && pre.right !=
                                                current)
                pre = pre.right;
     
            // Make current as the right child
            // of its inorder predecessor
            if (pre.right == null)
            {
                pre.right = current;
                current = current.left;
            }
     
            // Revert the changes made in the 'if' part to
            // restore the original tree i.e., fix the
            // right child of predecessor
            else
            {
                pre.right = null;
                 
                max_value = Math.max(max_value, current.data);
                min_value = Math.min(min_value, current.data);
             
                current = current.right;
            } // End of if condition pre.right == null
             
        } // End of if condition current.left == null
         
    } // End of while
        Pair<Integer,Integer>ans=new Pair<>(min_value,max_value);
        return ans;
	}
	
}
