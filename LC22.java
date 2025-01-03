import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class LC22 {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        doWork(ans,n*2,"",0,0,n);
        return ans;
    }


    void doWork(List<String> ans,int n , String cur,int maxOpen, int maxClose,int t){
        if(maxOpen > t || maxClose > t) return;
        if(n == 0){
            if(isValid(cur)) {
                ans.add(cur);
            }
            return;
        }
        doWork(ans,n-1,cur + "(",maxOpen+1,maxClose,t);
        doWork(ans,n-1,cur + ")",maxOpen,maxClose+1,t);
    }
    boolean isValid(String cur){
        Stack<Character> stack = new Stack<>();
        for(char c : cur.toCharArray()){
            if(c == '('){
                stack.push(c);
            }else if(c == ')'){
                if(stack.isEmpty() || stack.pop() != '('){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        LC22 l = new LC22();
        System.out.println(l.generateParenthesis(3));
    }

}
