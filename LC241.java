import java.util.ArrayList;
import java.util.List;

public class LC241 {
        public List<Integer> diffWaysToCompute(String expression) {
        String ops = "+-*";
        return backtrack(ops, expression, 0, expression.length());
    }

    List<Integer> backtrack(String ops,String expression ,int left,int right){
        List<Integer> res = new ArrayList<>();
        System.out.println(expression.substring(left,Math.min(expression.length(), right+1)));
        for(int i = left ; i < right ; i++){
            if(ops.contains(expression.charAt(i) + "")){
                int op = 0;
                List<Integer> num1 = backtrack(ops,expression,left,i-1);
                List<Integer> num2 = backtrack(ops,expression,i+1,right);
                if('+' == expression.charAt(i))
                    op = 1;
                if('-' == expression.charAt(i))
                    op = 2;
                if('*' == expression.charAt(i))
                    op = 3;

                for(int n1 : num1){
                    for(int n2 : num2){
                        switch(op){
                            case 1: 
                                res.add(n1 + n2);
                                break;
                            case 2:
                                res.add(n1 - n2);
                                break;
                            case 3:
                                res.add(n1 * n2);
                                break;
                        }
                    }
                }
            }
        }
        if(res.isEmpty())
            res.add(Integer.parseInt(expression.substring(left,Math.min(expression.length(), right+1))));

        return res;
    }

    public static void main(String[] args) {
        String expression = "2*3-4*5";
        List<Integer> res = new LC241().diffWaysToCompute(expression);
        System.out.println(res);
    }
}
