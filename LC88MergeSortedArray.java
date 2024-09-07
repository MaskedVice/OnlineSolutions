public class LC88MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = 0,b = 0;
        int[] ans = new int [m+n];

        for(int i = 0;i < m+n ; i++){
            if(a < m && b < n){
                if(nums1[a] <= nums2[b]){
                    ans[i] = nums1[a];
                    a++;
                } else{
                    ans[i] = nums2[b];
                    b++;
                }
            }
            else if(a < m){
                ans[i] = nums1[a];
                a++;
            }
            else if(b < n){
                ans[i] = nums2[b];
                b++;
            }
        }
        for(int i = 0 ; i < m+n ; i++){
            nums1[i] = ans[i];
        }
    }

    public static void main(String[] args) {
        LC88MergeSortedArray obj = new LC88MergeSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        obj.merge(nums1,3,nums2,3);

        for(int i = 0 ; i < nums1.length ; i++){
            System.out.println(nums1[i]);
        }
    }
}
