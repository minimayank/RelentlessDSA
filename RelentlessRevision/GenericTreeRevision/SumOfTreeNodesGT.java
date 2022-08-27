
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
	
	
	static int sum=0;
	public static int sumOfAllNode(TreeNode<Integer> root){
	    if(root==null)return 0;
        else{
            sum+=root.data;
            for(int i=0;i<root.children.size();i++){
                sumOfAllNode(root.children.get(i));
            }
        }
        return sum;
	}
}
