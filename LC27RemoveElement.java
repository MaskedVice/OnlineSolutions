/**
 * LC27RemoveElement
 */
public class LC27RemoveElement {

    public int removeElement(int[] nums, int val) {
        int l = 0, r = nums.length - 1;
        int res = 0;
        while(l<r){
            if(nums[r] == val){
                r--;
            } else if(nums[l] == val){
                nums[l++] = nums[r--];
                res++;
            } else{
                l++;
                res++;
            }
        } 
        return res+1;
    }


    public static void main(String[] args) {
        LC27RemoveElement x = new LC27RemoveElement();
        int ans = x.removeElement(new int[]{3,2,2,3}, 3);
    }



}