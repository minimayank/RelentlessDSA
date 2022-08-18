














public class Solution {

/*	
In a given Generic Tree, replace each node with its 
depth value. You need to just update the data of each node, no need to return or print anything.

10 3 20 30 40 2 40 50 0 0 0 0 
0 
1 1 1 
2 2




TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/

	public static void replaceWithDepthValue(TreeNode<Integer> root){ 

		replaceWithDepth(root,0);
		
	}
    public static void replaceWithDepth(TreeNode<Integer>root,int depth)
    {
        if(depth==0){
            root.data=depth;
           
        }
       
            for(int i=0;i<root.children.size();i++){
                replaceWithDepth(root.children.get(i),depth+1);
                root.children.get(i).data=depth+1;
            }
        
    }	
	
}
