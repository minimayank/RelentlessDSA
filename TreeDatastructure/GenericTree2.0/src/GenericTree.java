import java.util.Scanner;
public class GenericTree {
    public static TreeNode<Integer> takeInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the node data: ");
        int data=sc.nextInt();
        TreeNode<Integer>root=new TreeNode<>(data);
        System.out.println("Enter the number of Children of the node: ");
        int children=sc.nextInt();
        for(int i=0;i<children;i++){
            TreeNode<Integer>newNode=takeInput();
            root.children.add(newNode);
        }
        return root;
    }
    public static void printTree(TreeNode<Integer>root)
    {
        if(root==null){
            System.out.println("hey tree is empty.");
            return;
        }
        else{
            String out=root.data+" : ";
            for(int i=0;i<root.children.size();i++){
                out+=root.children.get(i).data+" , ";
            }
            System.out.println(out);
            for(int i=0;i<root.children.size();i++){
                printTree(root.children.get(i));
            }

        }
    }
    public static void main(String[] args) {
        System.out.println("THis is a program for tree datastructure ..");
        TreeNode<Integer>root=takeInput();
        printTree(root);
    }
}
