import com.sun.source.tree.Tree;

import java.util.Scanner;

public class GenericTrees {
    static Scanner sc=new Scanner(System.in);
    public static TreeNode<Integer> takeInput(){
        System.out.println("Enter your data: ");
        int data=sc.nextInt();
        TreeNode<Integer>root=new TreeNode<>(data);
        System.out.println("Enter its number of children");
        int children=sc.nextInt();
        for(int i=0;i<children;i++){
           TreeNode<Integer>newNode= takeInput();
           root.children.add(newNode);
        }

        return root;
    }
    public static void print(TreeNode<Integer>root){
        String s=root.data+" : ";
        for(TreeNode<Integer> i:root.children){
            s+=i.data+" , ";
        }
        System.out.println(s);
        for(int i=0;i<root.children.size();i++){
            print(root.children.get(i));

        }


    }
    public static void main(String[] args) {
       TreeNode<Integer>root= takeInput();
        print(root);
    }
}
