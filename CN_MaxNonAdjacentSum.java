import java.util.ArrayList;
/**
 * CN_MaxNonAdjacentSum
 */
public class CN_MaxNonAdjacentSum {

    public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		// Write your code here.
		ArrayList<Integer> list = new ArrayList<>();
		int[] sum = new int[]{0};
		f(0, nums.size(), sum, nums, list);
		return sum[0];
	}

	static void f(int i , int n, int[] sum , ArrayList<Integer> nums, ArrayList<Integer> list){
		if(i>=n){
			int curSum = list.stream().reduce(0,(a,b) -> a+b);
			sum[0] = Math.max(sum[0],curSum);
			return;
		}
		for(int j = i ; j < n ; j++){
			list.add(nums.get(j));
			f(j+2, n,sum,nums,list);
			list.remove(list.size()-1);
		}
	}

    public static void main(String[] args) {
        //run the code on list of 9,9,8,2
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(9);
        list.add(8);
        list.add(2);
        System.out.println(maximumNonAdjacentSum(list));
    }
}