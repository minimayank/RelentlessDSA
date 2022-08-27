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
	}*/

	static int ans=0;
	public static int numNodeGreater(TreeNode<Integer> root,int x){
        if(root==null)return 0;
        else{
            if(x<root.data){
                ans++;
            }
            for(int i=0;i<root.children.size();i++){
                numNodeGreater(root.children.get(i),x);
            }
            return ans;
        }
	}
	
}
