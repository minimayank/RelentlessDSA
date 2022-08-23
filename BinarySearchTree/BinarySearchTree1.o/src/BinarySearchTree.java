import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class BinarySearchTree {
/*
*              _           _                          _   ____ ____ _____
 _   _ _ __ | |__   __ _| | __ _ _ __   ___ ___  __| | | __ ) ___|_   _|
| | | | '_ \| '_ \ / _` | |/ _` | '_ \ / __/ _ \/ _` | |  _ \___ \ | |
| |_| | | | | |_) | (_| | | (_| | | | | (_|  __/ (_| | | |_) |__) || |
 \__,_|_| |_|_.__/ \__,_|_|\__,_|_| |_|\___\___|\__,_| |____/____/ |_|

*
* */
    public static BinaryTreeNode<Integer> takeInput(Scanner sc){
        System.out.println("Enter root data: ");
        int data=sc.nextInt();

        BinaryTreeNode<Integer>root=new BinaryTreeNode<>(data);
        if(root.left==null){
            root.left=takeInput(sc);
        }
        if(root.right==null){
            root.right=takeInput(sc);
        }
        return root;
    }
    public static BinaryTreeNode<Integer> takeInputLevelWise(){
        System.out.println("Enter root data: ");
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        if(data==-1)return null;
        BinaryTreeNode<Integer>root=new BinaryTreeNode<>(data);
        Queue<BinaryTreeNode<Integer>> pendingNodes=new ArrayDeque<>();
        pendingNodes.add(root);
        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer>curr=pendingNodes.poll();

            System.out.println("Enter data for left node of: "+curr.data);
            int left=sc.nextInt();
            if(left==-1){
                break;
            }
            if(curr.left==null){

                curr.left=new BinaryTreeNode<>(left);
                pendingNodes.add(curr.left);
            }
            System.out.println("Enter data for right node of: "+curr.data);

            if(curr.right==null){
                int right=sc.nextInt();
                if(right==-1)break;
                curr.right=new BinaryTreeNode<>(right);
                pendingNodes.add(curr.right);
            }
        }
        return root;
    }
    public static int leftMax(BinaryTreeNode<Integer>root){
        if(root==null)return Integer.MIN_VALUE;
        else{
            return Math.max(root.data,Math.max(leftMax(root.left),leftMax(root.right)));
        }
    }
    public static int rightMin(BinaryTreeNode<Integer>root){
        if(root==null)return Integer.MAX_VALUE;
        else{
            return Math.min(root.data,Math.min(rightMin(root.left),rightMin(root.right)));
        }
    }
    public static boolean isBST(BinaryTreeNode<Integer> root){
        if(root==null)return true;
        else{
          int left=leftMax(root.left);
          int right=rightMin(root.right);
          if(root.data<left)return false;
          if(root.data>right)return false;
          boolean ans= isBST(root.left);
          boolean ans2=isBST(root.right);
         if(ans&&ans2){
             return true;
         }
          return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("Testing whether given binary Tree is a BST or not");
        Scanner sc=new Scanner(System.in);
        BinaryTreeNode<Integer> root=takeInputLevelWise();
        System.out.println(isBST(root));

    }
}
