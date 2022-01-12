package universal;

public class StackUtil {
    public static Stack<Integer> addSorted(Stack<Integer> s, int x) {
        Stack<Integer> help = new Stack<Integer>();
        while (!s.isEmpty() && s.top() < x) {
            help.push(s.pop());
        }
        s.push(x);
        while (!help.isEmpty()) {
            s.push(help.pop());
        }
        return s;
    }

   public static Stack<Integer> copy(Stack<Integer> input) {
       Stack<Integer> temp = new Stack<>();
       Stack<Integer> output = new Stack<>();
       Integer x;
       while(!input.isEmpty()) {
           x = input.pop();
           temp.push(x);
           output.push(x);
       }
       while(!temp.isEmpty()) {
           input.push(temp.pop());
       }
       return output;
   }
}

