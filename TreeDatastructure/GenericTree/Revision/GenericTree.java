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

static Scanner sc=new Scanner(System.in);
   public static TreeNode<Integer> takeInput(){

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

    public static void print(TreeNode<Integer>root){
        String s=root.data+" : ";
        for(int i=0;i<root.children.size();i++){
            s=s+root.children.get(i).data+" , ";
        }
        System.out.println(s);
        for(int i=0;i<root.children.size();i++) {
            print(root.children.get(i));
        }

    }

    public static void main(String[] args) {
         TreeNode<Integer>root=takeInput();
         print(root);

    }

}
