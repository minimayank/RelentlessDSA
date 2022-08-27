import java.util.*;
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
	
	
	
	public static void printLevelWise(TreeNode<Integer> root){
		/* Your class should be named Solution 
 		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
        
        if(root==null)return;
        else{
            Queue<TreeNode<Integer>>pendingNodes=new LinkedList<>();
            TreeNode<Integer>ref=new TreeNode<>(Integer.MIN_VALUE);
            pendingNodes.add(root);
            
                pendingNodes.add(ref);
              
                while(!pendingNodes.isEmpty()){
                    
                TreeNode<Integer>temp=pendingNodes.poll();
                if(temp==ref){
                    if(!pendingNodes.isEmpty()){
                        System.out.println();
                        
                        pendingNodes.add(ref);
                    }
                }
                else{
                System.out.print(temp.data+" ");
                for(int i=0;i<temp.children.size();i++){
                    pendingNodes.add(temp.children.get(i));
                }
                
                }
              }
                
            }
            
        }
}
		

