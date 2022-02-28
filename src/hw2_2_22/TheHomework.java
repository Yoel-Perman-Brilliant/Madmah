package hw2_2_22;

import universal.Stack;

public class TheHomework {
    public static int func(Stack<Integer> stack, Stack<Integer> temp) {
        if (stack.isEmpty()) {
            while (!temp.isEmpty())
                stack.push(temp.pop());
            return 0;
        }
        if ((stack.top() % 2 == 0)) {
            stack.pop();
            return func(stack, temp);
        }
        temp.push(stack.pop());
        return func(stack, temp) + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 8, 3, 5};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        System.out.println(func(stack, new Stack<>()));
        System.out.println(stack);
    }
}
