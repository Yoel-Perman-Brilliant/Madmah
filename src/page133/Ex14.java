package page133;
import universal.*;

import javax.swing.*;

public class Ex14 {
    private static Stack<Integer> generateReverse(Stack<Integer> stack) {
        Stack<Integer> temp1 = new Stack<>();
        Stack<Integer> temp2 = new Stack<>();
        Integer x;
        while (!stack.isEmpty()) {
            x = stack.pop();
            temp1.push(x);
            temp2.push(x);
        }
        while (!temp2.isEmpty()) {
            stack.push(temp2.pop());
        }
        return temp1;

    }
    private static boolean isSubstack(Stack<Integer> stack, Stack<Integer> substack){
        Integer x;
        Stack<Integer> result = new Stack<>();
        Stack<Integer> reverse = generateReverse(substack);
        Stack<Integer> substackCopy = generateReverse(reverse);
        Stack<Integer> stackCopy = generateReverse(generateReverse(stack));
        if (substackCopy.isEmpty()) return true;
        while(!substackCopy.isEmpty()) {
            if(stackCopy.isEmpty()) return false;
            if (substackCopy.top() != stackCopy.top()) {
                x = stackCopy.pop();
            }
            else{
                x=stackCopy.pop();
                result.push(substackCopy.pop());
            }
        }
        while(!result.isEmpty() && !reverse.isEmpty()){
            if (result.pop() != reverse.pop()){
                return false;
            }
        }
        if ((result.isEmpty() && !reverse.isEmpty()) || (reverse.isEmpty() && !result.isEmpty()))
            return false;
        return true;
    }
    private static Stack<Integer> digitStack(Integer num){
        Stack<Integer> output = new Stack<>();
        while(num!=0){
            output.push(Math.abs(num%10));
            num/=10;
        }
        return output;
    }
    public static boolean areDigitsSubstack(Integer num, Stack<Integer> stack){
        Stack<Integer> digit_stack = digitStack(num);
        Stack<Integer> inverse = generateReverse(digitStack(num));
        return (isSubstack(stack, digit_stack) || isSubstack(stack, inverse));
    }
    public static void main(String[] args){
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        stack1.push(6);
        Stack stack2 = digitStack(123);
        System.out.println(areDigitsSubstack(3567586, stack1));
    }
}
