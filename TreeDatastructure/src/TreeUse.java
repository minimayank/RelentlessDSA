import java.util.*;

public class TreeUse {
    public static TreeNode<Integer> takeInput(){
        //int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the next node data:");
      int  n= sc.nextInt();


        TreeNode<Integer>root=new TreeNode<>(n);
        System.out.println("Enter the number of child nodes in a Tree. for the node "+n);
        int numberOfChildren=sc.nextInt();
        for(int i=0;i<numberOfChildren;i++){
            TreeNode<Integer>child=takeInput();
            root.children.add(child);

        }

        return root;
    }
    public static void main(String[] args) {
//        TreeNode<Integer>root=new  TreeNode<>(100);
//        TreeNode<Integer>node1=new TreeNode<>(1);
//        TreeNode<Integer>node2=new TreeNode<>(2);
//        TreeNode<Integer>node3=new TreeNode<>(3);
//        TreeNode<Integer>node4=new TreeNode<>(4);
//        root.children.add(node1);
//        root.children.add(node2);
//        root.children.add(node3);
//        node3.children.add(node4);

        takeInput();


    }
}
