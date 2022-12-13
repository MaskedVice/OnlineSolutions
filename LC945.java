import java.util.HashSet;

public class LC945 {
    public int minIncrementForUnique(int[] nums) {
        HashSet<Integer> sampleSpace = new HashSet<>();
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if(sampleSpace.contains(nums[i]))
            {
                while(sampleSpace.contains(nums[i]))
                {
                    nums[i]++;
                    counter++;
                }
            }
            sampleSpace.add(nums[i]);
        }
        return counter;
    }

    public static void main(String[] args) {
        int ans = new LC945().minIncrementForUnique(new int[]{3,2,1,2,1,7});
        System.out.println(ans);
    }
}
