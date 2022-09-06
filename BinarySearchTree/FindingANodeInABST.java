/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T>
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

public class Solution {
    public static boolean findNode(TreeNode <Integer> root, int key) {
        // Write your code here.
        if(root==null)return false;
        if(root.data==key)return true;
        else if(root.data>key){
            return findNode(root.left,key);
        }
        else{
            return findNode(root.right,key);
        }
       
    }
}
