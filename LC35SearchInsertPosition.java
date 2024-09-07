public class LC35SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int l = 0 , h = nums.length - 1;
        return binarySearch(l,h,nums,target);
    }
    public int binarySearch(int l , int h , int[] nums , int target){
        if(l > h) return l;
        int mid  = (l+h)/2;
        if(nums[mid] == target) return mid;
        else if(nums[mid] > target) return binarySearch(l,mid-1,nums,target);
        else return binarySearch(mid+1,h,nums,target);
    }

    public static void main(String[] args) {
        LC35SearchInsertPosition obj = new LC35SearchInsertPosition();
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(obj.searchInsert(nums,target));
    }
}
