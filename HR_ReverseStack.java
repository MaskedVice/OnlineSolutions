import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class HR_ReverseStack {

    /**
     * Reverses the order of elements in the given Stack of Integers.
     *
     * @param  stack  the Stack to be reversed
     */
    public static void reverseStack(Stack<Integer> stack) {
		// write your code here
		int i = 0;
        List<Integer> b = new ArrayList<>();

        while(!stack.isEmpty()){
            b.add(stack.pop());
        }

        while(i<b.size()){
            stack.push(b.get(i));
            i++;
        }
	}

    /**
     * Reverses the elements of a stack recursively.
     *
     * @param  stack  the stack to be reversed
     */
    public static void reverseStackRecursive(Stack<Integer> stack) {
		// write your code here
		if(stack.isEmpty()) {
			return;
		}
		System.out.print(stack.pop() + " ");
		reverseStack(stack);
		
	}

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        reverseStack(stack);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
