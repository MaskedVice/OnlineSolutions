import java.util.Arrays;

public class LC179 {
    public String largestNumber(int[] nums) {
        String[] numb = new String[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            numb[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(numb,(a,b) -> (b+a).compareTo(a+b));

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < nums.length ; i++){
            sb.append(numb[i]);
        }
        return sb.toString().equals("0")? "0" : sb.toString();  
    }


    public static void main(String[] args) {

        int[] nums = {3,30,34,5,9};
        String ans = new LC179().largestNumber(nums);
        System.out.println(ans);
    }
}
