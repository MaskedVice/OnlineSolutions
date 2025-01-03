import java.util.ArrayList;
import java.util.List;

public class LC_539 {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> set = new ArrayList<>();
        for(String t : timePoints) {
            int hour = Integer.parseInt(t.substring(0,2));
            int minute = Integer.parseInt(t.substring(3));
            set.add(hour*60+minute);
        }
        set.sort(Integer::compareTo);
        int min = Integer.MAX_VALUE;    
        for(int i = 1 ; i < set.size() ; i++) {
            int diff = set.get(i) - set.get(i-1);
            if(diff == 0) return 0;
            min = Math.min(min, Math.abs(1440 - diff));

        }
        return min;
    }

    public static void main(String[] args) {
        List<String> timePoints = new ArrayList<>();
        //"02:39","10:26","21:43"
        timePoints.add("02:39");
        timePoints.add("10:26");
        timePoints.add("21:43");
        System.out.println(new LC_539().findMinDifference(timePoints));
    }
}
