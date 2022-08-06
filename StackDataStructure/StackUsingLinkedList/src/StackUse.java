public class StackUse {
    public static void main(String[] args) {
        StackLL<Integer>stack=new StackLL<>();
        System.out.println(stack.isEmpty());
        stack.push(1);stack.push(2);stack.push(3);
        System.out.println(stack.peek());

    }
}
