package page133;

import universal.Stack;
import universal.StackUtil;

public class Ex18_2 {
    public static Stack<Couple> coupleStack(Stack<Integer> input) {
        Stack<Couple> output = new Stack<>();
        while(!input.isEmpty()) {
            output.push(generateCouple(input));
        }
        return output;
    }
    public static Couple generateCouple(Stack<Integer> stack) {
        int counter = 0;
        int value = stack.top();
        int current = stack.pop();
        while (value == current && !stack.isEmpty()) {
            counter++;
            current = stack.pop();
        }
        return new Couple(value, counter);
    }

    public static Stack<Couple> sortedCoupleStack(Stack<Integer> stack) {
        Stack<Integer> sortedStack = sort(stack);
        Stack<Couple> output = new Stack<>();
        while(!sortedStack.isEmpty()) {
            output.push(generateCouple(sortedStack));
        }
        return output;
    }

    public static Stack<Integer> sort(Stack<Integer> stack){
        Stack<Integer> tempStack = new Stack<>();
        Integer x;
        while(!stack.isEmpty()){
            x = stack.pop();
            while(!tempStack.isEmpty() && tempStack.top()<x){
                stack.push(tempStack.pop());
            }
            tempStack.push(x);
        }
        return tempStack;
    }


    public static void main(String[] args) {
        Integer[] arr = {3, 3, 4, 4, 4, 1, 1};
        Stack<Integer> input = new Stack<>();
        for (int i = 0; i< arr.length; i++)
            input.push(arr[i]);
        System.out.println(sortedCoupleStack(input));
    }
}
