import java.util.*;
import java.util.List;
public class CN_ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();

        for(int i = 0 ; i < nums.length ; i++){
            List<List<Integer>> cur = twoSum(i,nums,0-nums[i]);
            if(cur != null){
                for (List<Integer> list : ans) {
                    list.add(nums[i]);
                    Collections.sort(list);
                    ans.add(list);
                } 
            }
        }
        return new ArrayList<>(ans);
    }

    public List<List<Integer>> twoSum(int toSkip ,int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(i != toSkip){
                if(map.containsKey(target - nums[i])){
                    List<Integer> cur = new ArrayList<>();
                    cur.add(target - nums[i]);
                    cur.add(nums[i]);
                    ans.add(cur);
                }
                map.put(nums[i],i);
            }
        }
        if(ans.isEmpty()){
            return null;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = new CN_ThreeSum().threeSum(nums);
        for(List<Integer> i : ans){
            System.out.println(i);
        }
    }
}
