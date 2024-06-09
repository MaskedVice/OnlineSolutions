import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class CN_ReverseArray {
    public static void reverseArray(List<Integer> arr, int m)
    {
        List<Integer> res = new ArrayList<>(arr.subList(0,m+1));
        int n = arr.size()-1;
        while(n>m){
            int temp = arr.get(n);
            n--;
            res.add(temp);
        }
        arr = res;
    }

    public static void main(String[] args) {

        List<Integer> arr = (List<Integer>) Arrays.asList(1, 2, 3, 4, 5, 6);
        int m = 3;
        reverseArray(arr, m);
        System.out.println(arr);
    }
}
