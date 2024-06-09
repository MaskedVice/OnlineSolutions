import java.util.PriorityQueue;

public class CN_TOpKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[1]-a[1]);

        for(int i = 0 ; i < nums.length ; i++){
            int count = 0;
            for(int j = i ; j < nums.length ; j++){
                if(j>nums.length || nums[j] != nums[i]){
                    pq.add(new int[]{nums[i],count});
                    i = j-1;
                    break;
                }
                count++;
            }
        }

        int i = 0;
        while(k>0){
            int[] t = pq.poll();
            ans[i] = t[1];
            i++;
            k--;
        }
        return ans; 
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] ans = new CN_TOpKFrequent().topKFrequent(nums,k);
        for(int i = 0 ; i < ans.length ; i++){
            System.out.println(ans[i]);
        }
    }
    
}
