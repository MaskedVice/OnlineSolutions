import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class LC229 {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> count = new HashMap<>();
        for(int i : nums){
            count.put(i,count.getOrDefault(i,0)+1);
        }
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for(Map.Entry<Integer,Integer> e : count.entrySet()){
            if(e.getValue() > n/3){
                ans.add(e.getKey());
            }
        }
        return ans;
    }
}
