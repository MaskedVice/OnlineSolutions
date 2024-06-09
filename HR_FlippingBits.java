
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HR_FlippingBits{
    public static long flippingBits(long n) {
        // Write your code here
        String l2Bin = Long.toBinaryString(n);
        l2Bin = Stream.generate(() ->"0").limit(32-l2Bin.length()).collect(Collectors.joining()) + l2Bin;
        
        long res = 0L;
        for (int i = 31; i >= 0; i--) {
            if(l2Bin.charAt(i)=='0'){
                res += Math.pow(2,31-i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        flippingBits(3);
    }
}