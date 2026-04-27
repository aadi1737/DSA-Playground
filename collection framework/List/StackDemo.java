package List;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // STack extends Vector means Stack is also a Thread Safe
        // *All methods are synchronised

        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(7);
        stack.push(1);
        System.out.println("Stack Top ele is:"+stack.peek());
        stack.add(20);
        System.out.println(stack);
        System.out.println("Stack Top ele is:"+stack.peek());

        //WHy still we have add method?
        // Ans: Cause Vector Extends List ..so we have all list method as well as in Stack
    }
}
