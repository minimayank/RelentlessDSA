import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {


    public static void printLevelWise(BinaryTreeNode<Integer>root){
        if(root==null)return;
        else{
            Queue<BinaryTreeNode<Integer>> pendingNodes=new LinkedList<>();  //*very important
            pendingNodes.add(root);
            pendingNodes.add(null);
            while(!pendingNodes.isEmpty()){
                BinaryTreeNode<Integer>temp=pendingNodes.poll();
                if(temp==null){
                    if(!pendingNodes.isEmpty()){
                        System.out.println();
                        pendingNodes.add(null);
                    }
                }else {
                    System.out.print(temp.data + " ");
                    if (temp.left != null) {
                        pendingNodes.add(temp.left);
                    }
                    if (temp.right != null) {
                        pendingNodes.add(temp.right);
                    }
                }
            }
        }
    }
    public static BinaryTreeNode<Integer> takeInputLevelWise(){


            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the data of root: ");
            int data=sc.nextInt();
            BinaryTreeNode<Integer>root=new BinaryTreeNode<>(data);
            Queue<BinaryTreeNode<Integer>>pendingNodes=new ArrayDeque<>();
            pendingNodes.add(root);
            while(!pendingNodes.isEmpty()){
                BinaryTreeNode<Integer>temp=pendingNodes.poll();
                System.out.println("Enter the left node of: "+temp.data);
                int left=sc.nextInt();
                if(left==-1){
                    temp.left=null;

                }
                else{
                    BinaryTreeNode<Integer>leftNode=new BinaryTreeNode<>(left);
                    temp.left=leftNode;
                    pendingNodes.add(leftNode);
                }
                System.out.println("Enter the right node of: "+temp.data);
                int right=sc.nextInt();
                if(right==-1){
                    temp.right=null;

                }
                else{
                    BinaryTreeNode<Integer>rightNode=new BinaryTreeNode<>(right);
                    temp.right=rightNode;
                    pendingNodes.add(rightNode);
                }
            }
        return root;
    }
    public static void main(String[] args) {
        BinaryTreeNode<Integer>root=takeInputLevelWise();
        System.out.println("Printing a node..");
        printLevelWise(root);
    }
}


/*

 _ __ ___ _ __ ___   __ _(_)_ __   __| | ___ _ __ 
| '__/ _ \ '_ ` _ \ / _` | | '_ \ / _` |/ _ \ '__|
| | |  __/ | | | | | (_| | | | | | (_| |  __/ |   
|_|  \___|_| |_| |_|\__,_|_|_| |_|\__,_|\___|_|   
   /*!!! very Important!!!                                              
Note that when we try to print a binary tree level wise line by line,
We must ensure to implement the required queue using a linkedlist and not ArrayDeque as it will give us a null pointer exception as it doesn't 
allow insertion of null in the queue.

Also the steps include:
     if----> where we have to change the line
     .
     .
     .
     .
     else---> for rest of the code.
https://stackoverflow.com/questions/28147076/understanding-queue-insertion

*/
