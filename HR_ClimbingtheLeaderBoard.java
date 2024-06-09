import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HR_ClimbingtheLeaderBoard {
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        List<Integer> res = new ArrayList<>();
        ranked = ranked.stream().distinct().collect(Collectors.toList());
        Collections.reverse(ranked);
        for (Integer i : player) {
           int curRank = ranked.size()+1;
           while(ranked.size() > 0 && i >= ranked.get(0)){
               ranked.remove(0);
               curRank--;
           }
           res.add(curRank);
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(climbingLeaderboard(new ArrayList(List.of(100, 100, 50, 40, 40, 20, 10)) ,new ArrayList(List.of(5, 25, 50, 120))).toString());
    }
}
