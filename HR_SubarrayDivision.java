import java.util.Arrays;
import java.util.List;
/**
 * HR_SubarrayDivision
 */
public class HR_SubarrayDivision {

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int numWays = 0;
        for(int i = 0 ; i < s.size()-2 ; i++ ){
            int sum = 0;
            for(int j = i ; j < i+m ; j++){
                sum += s.get(j);
            }
            if(sum == d){
                numWays++;
            }
        }
        return numWays;
    }

    public static void main(String[] args) {
        List<Integer> s = Arrays.asList(2,2,1,3,2);
        int d = 4;
        int m = 2;
        System.out.println(birthday(s, d, m));
    }
}