package page133;

import universal.Stack;

public class Ex18 {
    private static class Couple {
        private double num;
        private int appears;

        public Couple(double num, int appears) {
            this.num = num;
            this.appears = appears;
        }

        public Couple(double[] arr) {
            this(arr[0], (int)arr[1]);
        }

        public double getNum() {
            return num;
        }
        public int getAppears(){
            return appears;
        }
    }
    public static Stack<Double> sort(Stack<Double>stack){
        Stack<Double> tempStack = new Stack<>();
        Double x;
        while(!stack.isEmpty()){
            x = stack.pop();
            while(!tempStack.isEmpty() && tempStack.top()<x){
                stack.push(tempStack.pop());
            }
            tempStack.push(x);
        }
        return tempStack;
    }
    public static Stack<Double> newStack(Stack<Couple> stack){
        Stack<Double> output = new Stack<>();
        while (!stack.isEmpty()){
            Couple current = stack.pop();
            for(int i=0; i<current.getAppears(); i++){
                output.push(current.getNum());
            }
        }
        output = sort(output);
        return output;
    }
    public static void main(String[] args){
        Couple couple1 = new Couple(3.5, 4);
        Couple couple2 = new Couple(2.7, 3);
        Couple couple3 = new Couple(4.8, 0);
        Couple couple4 = new Couple(8.2, 1);
        Stack<Couple> stack = new Stack<>();
        stack.push(couple1);
        stack.push(couple2);
        stack.push(couple3);
        stack.push(couple4);
        System.out.println(newStack(stack));
    }
}

