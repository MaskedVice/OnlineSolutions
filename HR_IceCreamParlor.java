import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HR_IceCreamParlor {
    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum == m) return List.of(i+1, j+1);
            }
        }
        return new ArrayList<>();
    }
    public static void main(String[] args) {
        System.out.println(icecreamParlor(9, List.of(5 ,4,5 ,3, 2)));
    }
    
}
