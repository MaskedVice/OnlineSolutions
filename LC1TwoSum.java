import java.util.HashMap;

class LC1TwoSum
{
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> res = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++){
            if(res.containsKey(target-nums[i])){
                return new int[]{i,res.get(target-nums[i])};
            }
            res.put(nums[i],i);
        }
        return null;
    }
    public static void main(String[] args) {
        twoSum(new int []{2,7,11,15}, 9);
    }
}