package page133;

import universal.LinkedListUtil;
import universal.Node;
import universal.Stack;

public class Ex17 {
    public static Stack copy(Stack stack) {
        Stack p1 = new Stack<>();
        Stack p2 = new Stack();
        Object x;
        while (!stack.isEmpty()) {
            p1.push(stack.pop());
        }
        while (!p1.isEmpty()) {
            x = p1.pop();
            p2.push(x);
            stack.push(x);
        }
        return p2;
    }

    public static int longestSequence(Stack<Integer> stack) {
        Integer max = 1;
        int counter = 1;
        Stack<Integer> p = copy(stack);
        p.pop();
        while (!p.isEmpty()) {
            if (stack.pop() == stack.top() + 1) {
                counter++;
            } else {
                counter = 1;
            }
            max = Math.max(counter, max);
            p = copy(stack);
            if (!p.isEmpty())
                p.pop();
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] arr = {20, 21, 11, 10, 9, 8, 7, 2, 5, 4, 3, 2, 33, 6, 2};
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            stack.push(arr[i]);
        }
        System.out.println(longestSequence(stack));
    }
}
