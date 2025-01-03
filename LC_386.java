import java.util.ArrayList;
import java.util.List;

public class LC_386 {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();

        int x = 1;
        for(int i = 1 ; i <= Math.min(n,9) ; i++){
            res.add(i);n--;
        }

        for(int i = 0 ; i <=Math.min(9,n) ; i++){
            res.add(( x * 10 ) + i);
            n--;
        }
        x++;
        return res;
    }


    public static void main(String[] args) {

        int n = 13;
        List<Integer> res = new LC_386().lexicalOrder(n);
        for(int i = 0 ; i < res.size() ; i++){
            System.out.print(res.get(i) + " ");
        }
    }
}
