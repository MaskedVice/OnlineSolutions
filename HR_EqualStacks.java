import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * HR_EqualStacks
 */
public class HR_EqualStacks {

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        // Write your code here
            int he1 = h1.stream().mapToInt(Integer::intValue).sum();
            int he2 = h2.stream().mapToInt(Integer::intValue).sum();
            int he3 = h3.stream().mapToInt(Integer::intValue).sum();
            int min = 0;
            while(true){
                min = Math.min(Math.min(he1, he2), he3);
                if(he1 > min){
                    int temp = h1.remove(0);
                    he1 -= temp;
                }
                if(he2 > min){
                    int temp = h2.remove(0);
                    he2 -= temp;
                }
                if(he3 > min){
                    int temp = h3.remove(0);
                    he3 -= temp;
                }
                if(he1 == he2 && he3 == he1){
                    break;
                }
            }
            return min;
        }

        public static void main(String[] args) {
            List<Integer> h1 =Arrays.asList(3, 2, 1, 1, 1);
            List<Integer> h2 = Arrays.asList(4, 3, 2);
            List<Integer> h3 = Arrays.asList(1, 1, 4, 1);
            System.out.println(equalStacks(new ArrayList<>(h1),new ArrayList<>(h2),new ArrayList<>(h3)));
        }
}