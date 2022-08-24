import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class BinarySearchTree {

    public static BinaryTreeNode<Integer> levelWiseInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the root data; ");
        int data=sc.nextInt();
        if(data==-1){
            System.out.println("Hey your BST is empty.");
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(data);
        Queue<BinaryTreeNode<Integer>>pendingNodes=new ArrayDeque<>();
        pendingNodes.add(root);
        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer>curr=pendingNodes.poll();
            System.out.println("Enter the left child for node: "+curr.data);
            int leftData=sc.nextInt();
            if(leftData==-1){
                curr.left=null;
            }
            else{
                BinaryTreeNode<Integer>leftNode=new BinaryTreeNode<>(leftData);
                curr.left=leftNode;
                pendingNodes.add(leftNode);
            }
            System.out.println("Enter the right child for node: "+curr.data);
            int rightData=sc.nextInt();
            if(rightData==-1){

                curr.right=null;
            }
            else{
                BinaryTreeNode<Integer>rightNode=new BinaryTreeNode<>(rightData);
                curr.right=rightNode;
                pendingNodes.add(rightNode);
            }
        }
        return  root;
    }
    public static void levelOrderTraversal(BinaryTreeNode<Integer>root){
        if(root==null){
            System.out.println("Binary Search Tree is empty.");
            return;
        }


            Queue<BinaryTreeNode<Integer>>pendingNodes=new ArrayDeque<>();
            pendingNodes.add(root);
            pendingNodes.add(null);
            while (!pendingNodes.isEmpty()){
                BinaryTreeNode<Integer>curr=pendingNodes.poll();
                if(curr==null){
                    if(!pendingNodes.isEmpty()){
                        System.out.println();
                        pendingNodes.add(null);
                    }
                }
                else{
                    if(curr.left!=null){
                        pendingNodes.add(curr.left);
                    }
                    if(curr.right!=null){
                        pendingNodes.add(curr.right);
                    }
                    System.out.print(curr.data+" ");
                }
            }

    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer>root=levelWiseInput();
        levelOrderTraversal(root);

    }
}
