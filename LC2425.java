public class LC2425 {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        if( n1 % 2 == 0 && n2 % 2 == 0) return 0;
        if( n1 % 2 == 0) return xor(nums1);
        if( n2 % 2 == 0) return xor(nums2);
        return xor(nums1) ^ xor(nums2);
    }
    
    private int xor(int[] nums){
        int val = nums[0];
        for(int i = 1; i < nums.length; i++){
            val ^= nums[i];
        }
        return val;
    }
}
