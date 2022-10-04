import java.util.Stack;

public class LC20ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        char ch;
        st.push(s.charAt(i++));
        while(i<s.length())
        {
            ch = s.charAt(i++);
            if(st.isEmpty())
            {
                st.push(ch);
            }
            else if(( ch == ')' && st.peek() == '(') || ( ch =='}' && st.peek() == '{') || (ch == ']' && st.peek() == '['))
            {
                st.pop();
            }
            else
            {
                st.push(ch);
            }
        }
        return st.isEmpty() ? true : false;
    }
    public static void main(String[] args) {
        isValid("(]");
    }
}
