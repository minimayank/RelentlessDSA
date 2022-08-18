public class Solution {

/*	TreeNode class 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
    
   Given a generic tree and an integer x, check if x is present in the\
   given tree or not. Return true if x is present, return false otherwise.
   
   40
10 3 20 30 40 2 40 50 0 0 0 0 
    
	}*/
	
	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){

		// Write your code here
         //if(root==null)return false;
        boolean ans=false;
        if(root==null)return false;
        else{
            if(root.data==x)return true;
            else{
                TreeNode<Integer>temp=root;
                for(int i=0;i<temp.children.size();i++){
                    ans=checkIfContainsX(temp.children.get(i),x);
                    if(ans)return true;
                }
                
            }
           return false;
        }
        
	}
	
}
