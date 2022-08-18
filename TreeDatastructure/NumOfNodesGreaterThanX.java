public class NumOfNodesGreaterThanX {

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

	
	public static int numNodeGreater(TreeNode<Integer> root,int x){
        int count=0;
		// Write your code here	
        if(root==null)return 0;
        else{
            if(root.data>x){
                count++;
            }
            TreeNode<Integer>temp=root;
            for(int i=0;i<temp.children.size();i++){
                count+=numNodeGreater(temp.children.get(i),x);
            }
            return count;
        }
        

	}
	
}
