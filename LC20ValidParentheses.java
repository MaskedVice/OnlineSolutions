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

    public static boolean isValid1(String s) {
        Stack<Character> st = new Stack<>();
        char[] ch = s.toCharArray();
        
        int i = 0;
        while(i < ch.length){
            if(isOpeningBraces(ch[i])){
                st.push(ch[i]);
                i++;
            }else if(isClosingBraces(ch[i])){
                if( !st.isEmpty() && openCloseMatch(st.peek(),ch[i])){
                    st.pop();
                    i++;
                } else {
                    st.push(ch[i]);
                    i++;
                }
            }
        }
        return st.isEmpty();
    }

    public static boolean isOpeningBraces(char c){
        return c=='(' || c == '{' || c=='[';
    }

    public static boolean isClosingBraces(char c){
        return c==')' || c == '}' || c==']';
    }

    public static boolean openCloseMatch(char a ,char b){
        return (a == '(' &&  ')'== b) ||
        (a == '{' &&  '}'== b) ||
        (a == '[' &&  ']'== b) ;
    }
    public static void main(String[] args) {
        System.out.println(isValid("]"));
    }
}
