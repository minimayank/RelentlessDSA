import com.sun.source.tree.Tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
public class TreePrograms{
    public static TreeNode<Integer> takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the node data: ");
        int data = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<>(data);
        System.out.println("Enter the number of Children of the node: ");
        int children = sc.nextInt();
        for (int i = 0; i < children; i++) {
            TreeNode<Integer> newNode = takeInput();
            root.children.add(newNode);
        }
        return root;
    }

    public static TreeNode<Integer> takeInputLevelWise() {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the data of root node: ");
        int data = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<>(data);
        Queue<TreeNode<Integer>> pendingNodes = new ArrayDeque<>();
        pendingNodes.add(root);
        while (!pendingNodes.isEmpty()) {
            try {
                TreeNode<Integer> temp = pendingNodes.poll();
                System.out.println("Enter the number of children for " + temp.data);
                int children = sc.nextInt();
                for (int i = 0; i < children; i++) {
                    System.out.println("Enter the " + i + "th child of " + temp.data);
                    int childData = sc.nextInt();
                    TreeNode<Integer> child = new TreeNode<>(childData);
                    pendingNodes.add(child);
                    temp.children.add(child);
                }

            } catch (Exception e) {
                System.out.println("queue is empty...");
            }
        }

        return root;
    }

    public static void printTree(TreeNode<Integer> root) {
        if (root == null) {
            System.out.println("hey tree is empty.");
            return;
        } else {
            String out = root.data + " : ";
            for (int i = 0; i < root.children.size(); i++) {
                out += root.children.get(i).data + " , ";
            }
            System.out.println(out);
            for (int i = 0; i < root.children.size(); i++) {
                printTree(root.children.get(i));
            }

        }
    }


    public static void printLevelWise(TreeNode<Integer> root) {

        if (root == null) {
            System.out.println("Nothing to print, tree is empty.");
            return;
        } else {

            Queue<TreeNode<Integer>> pendingNodes = new ArrayDeque<>();
            pendingNodes.add(root);
            while (!pendingNodes.isEmpty()) {
                int sizeOflevel = pendingNodes.size();
                while (sizeOflevel > 0) {
                    TreeNode<Integer> temp = pendingNodes.poll();
                    System.out.print(temp.data + " ");
                    for (int i = 0; i < temp.children.size(); i++) {
                        pendingNodes.add(temp.children.get(i));
                    }
                    sizeOflevel--;
                }
                System.out.println();
            }

        }

    }


    public static int largestData(TreeNode<Integer> root) {
        if (root == null) return Integer.MIN_VALUE;
        else {
            int largest = root.data;
            for (int i = 0; i < root.children.size(); i++) {
                int childLargest = largestData(root.children.get(i));
                if (childLargest > largest) {
                    largest = childLargest;
                }
            }
            return largest;
        }
    }



    public static int numNodeGreater(TreeNode<Integer> root, int x) {
     int count=0;
     if(root==null)return  0;
     else{
         if(root.data>x){
             count++;
         }
         for(int i=0;i<root.children.size();i++){
             count+=numNodeGreater(root.children.get(i),x );

         }
         return count;
     }
}


    public static void main(String[] args) {
        System.out.println("THis is a program for tree datastructure ..");
        TreeNode<Integer>root=takeInputLevelWise();
        printLevelWise(root);
//        System.out.println("largest: "+largestData(root));
        System.out.println(numNodeGreater(root,10));
    }
}
