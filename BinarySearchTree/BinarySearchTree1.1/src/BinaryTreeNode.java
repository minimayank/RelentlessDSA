public class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left,right;
    BinaryTreeNode(T data){
        this.data=data;
        left=right=null;
    }
}
