public class Solution {

	/*	Binary Tree Node class 
	 * 
	 * 	class BinaryTreeNode<T> {
			T data;
			BinaryTreeNode<T> left;
			BinaryTreeNode<T> right;
			
			public BinaryTreeNode(T data) {
				this.data = data;
			}
		}
		*/
	
		public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
		    return bst(arr,0,n-1);
            
		}
        public static BinaryTreeNode<Integer> bst(int[] a,int l,int n){
            if(n>=l){
                int mid=(n+l)/2;
                
                BinaryTreeNode<Integer>root=new BinaryTreeNode<>(a[mid]);
                root.left= bst(a,l,mid-1);
                root.right=bst(a,mid+1,n);
                return root;
            }
        else    
        return null;
        }
	}
