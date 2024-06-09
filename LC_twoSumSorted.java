public class LC_twoSumSorted {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length-1;
        while(i<=j){
            int diff = numbers[j] + numbers[i];
            if(diff > target){
                j--;
            } else if(diff < target){
                i++;
            } else if (diff == target){
                return new int[] {i+1,j+1};
            }
        }
        return null; 
    }

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] ans = new LC_twoSumSorted().twoSum(numbers,target);
        for(int i = 0 ; i < ans.length ; i++){
            System.out.println(ans[i]);
        }
    }
}
