/***********************************************************

 Following is the TreeNode class structure:

 class TreeNode {
    public:
    T data;
    TreeNode<T> *left;s
    TreeNode<T> *right;

    TreeNode(T data) {
        this->data = data;
        left = NULL;
        right = NULL;
    }
 };

 ************************************************************/

class Solution {

  public static int countTheNodes(TreeNode<Integer>root, int L, int R) {
    // Write your code here.
     if(root==null)return 0;
     else{
         int count=0;
         countTheNodes(root,L,R,count);
         return count;
     }
  }
  public static void countTheNodes(TreeNode<Integer>root,int L,int R,int count){
      if(root==null){
          return;
      }
      else{
          if(root.data>=L&&root.data<=R){
              count++;
          }
          countTheNodes(root.left,L,R,count);
          countTheNodes(root.right,L,R,count);
      }
 
  }  
}
