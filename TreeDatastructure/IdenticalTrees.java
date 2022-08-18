public class IdenticalTrees {

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
	
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){

		// Write your code here
        if(root1.children.size()!=root2.children.size())return false;
        if(root1.data!=root2.data){
            return false;
        }
        else{
            for(int i=0;i<root1.children.size();i++){
               return checkIdentical(root1.children.get(i),root2.children.get(i));
            }
            return true;
        }
	}
	
}
