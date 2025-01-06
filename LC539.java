import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class LC539 {
    public int findMinDifference(List<String> timePoints) {
        int[] times = new int[timePoints.size()];
        int i = 0;
        for(String tp : timePoints){
            int hour = Integer.parseInt(tp.substring(0,2));
            int min = Integer.parseInt(tp.substring(3));
            times[i] = hour*60 + min;
            i++;
        }
        Arrays.sort(times);
        int ans = Integer.MAX_VALUE;
        for(int j = 1 ; j < times.length ; j++){
            int time2 = times[j];
            int time1 = times[j-1];
            if(time1 == time2) return 0;
            ans = Math.min(ans, Math.abs(time2 - time1));        
        }
        ans = Math.min(ans, Math.abs(times[0] + times[times.length-1] - 1440));
        return ans;
    }

    public static void main(String[] args) {
        //["02:39","10:26","21:43"]
        List<String> timePoints = new ArrayList<>();
        timePoints.add("02:39");
        timePoints.add("10:26");
        timePoints.add("21:43");
        LC539 obj = new LC539();
        System.out.println(obj.findMinDifference(timePoints));
    }
}
