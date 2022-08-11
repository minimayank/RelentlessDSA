import java.util.Scanner;
public class GenericTree {
    public static TreeNode<Integer> basicTakeInput(){
      TreeNode<Integer>root=new TreeNode<>(2);
      TreeNode<Integer>left=new TreeNode<>(1);
      TreeNode<Integer>left2=new TreeNode<>(0);
      TreeNode<Integer>right=new TreeNode<>(3);
      root.children.add(left);
      root.children.add(right);
      left.children.add(left2);

      return root;
    }

   public static TreeNode<Integer> takeInput(){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter the data of the root.");
        int data=sc.nextInt();
        TreeNode<Integer>root=new TreeNode<Integer>(data);
        System.out.println("Enter no of children::");
        int children=sc.nextInt();
        for(int i=0;i<children;i++){

            root.children.add(takeInput());

        }
       return root;
    }

    public static void main(String[] args) {
         TreeNode<Integer>root=takeInput();

    }

}
