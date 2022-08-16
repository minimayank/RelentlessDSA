public class SumOfTreeNodesGT {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}
                       ___  _____ _____              _   _           _      
 ___ _   _ _ __ ___  / _ \|  ___|_   _| __ ___  ___| \ | | ___   __| | ___ 
/ __| | | | '_ ` _ \| | | | |_    | || '__/ _ \/ _ \  \| |/ _ \ / _` |/ _ \
\__ \ |_| | | | | | | |_| |  _|   | || | |  __/  __/ |\  | (_) | (_| |  __/
|___/\__,_|_| |_| |_|\___/|_|     |_||_|  \___|\___|_| \_|\___/ \__,_|\___|
                                                                           
        ____                      _      _                      
 ___   / ___| ___ _ __   ___ _ __(_) ___| |_ _ __ ___  ___  ___ 
/ __| | |  _ / _ \ '_ \ / _ \ '__| |/ __| __| '__/ _ \/ _ \/ __|
\__ \ | |_| |  __/ | | |  __/ |  | | (__| |_| | |  __/  __/\__ \
|___/  \____|\___|_| |_|\___|_|  |_|\___|\__|_|  \___|\___||___/

  
  
  
  
  
  
  
  
  */
	
	
	static int sum=0;
	public static int sumOfAllNode(TreeNode<Integer> root){
	     if(root==null)return 0; //corner case not a base case;
        else{
            int sum=root.data;
            for(int i=0;i<root.children.size();i++){
                int ans=sumOfAllNode(root.children.get(i));
                sum+=ans;
            }
            return sum;
        }
         
	}
}
