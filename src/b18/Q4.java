package b18;

import universal.Stack;

import java.util.Arrays;
import java.lang.String;

public class Q4 {

    public static int lastAndRemove(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }
        int output = temp.pop();
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
        return output;
    }

    public static Stack<TwoItems> stackTwoItems(Stack<Integer> stk1) {
        Stack<TwoItems> output = new Stack<>();
        while (!stk1.isEmpty()) {
            output.push(new TwoItems(stk1.pop(), lastAndRemove(stk1)));
        }
        return output;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 5, 3, 8, 8, 9};
        Stack<Integer> stack = new Stack<>();
        for (int value : arr) {
            stack.push(value);
        }
        System.out.println(stack);
        System.out.println(stackTwoItems(stack));
    }
}
