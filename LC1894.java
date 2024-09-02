import java.util.Arrays;

public class LC1894 {
    public int chalkReplacer(int[] chalk, int k) {
        int arrSum = Arrays.stream(chalk).sum();
        long l = Long.valueOf(k);
        l = l%arrSum;
        k = (int) l;
        
        for(int i = 0 ; i < chalk.length ; i++){
            if(chalk[i] > k){
                return i;
            }
            k = k - chalk[i];
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] chalk = new int[]{96805,14622,42759,90178,16799};
        int k = 539095482;
        LC1894 obj = new LC1894();
        System.out.println(obj.chalkReplacer(chalk,k));
    }
}
