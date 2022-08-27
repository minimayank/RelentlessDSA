public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	static int leaves=0;
	public static int countLeafNodes(TreeNode<Integer> root){

		// Write your code here
        if(root==null)return 0;
        else{
            if(root.children.size()==0)leaves++;
            for(int i=0;i<root.children.size();i++){
                countLeafNodes(root.children.get(i));
            }
            return leaves;
        }

	}
	
}
