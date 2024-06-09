
public class HR_SumVsXor {
    public static long sumXor(long n) {
        // So, consider this number as a binary string:
        // i.e. 1001000110100
        // All of the numbers that will satisfy the
        // condition, is any number that has zeros
        // where the ones are in the string. 
            
        // You can see that this is the case
        // if you consider a single bit.
        // In the case of 1:
        //   1 + 1 = 10 while 1 + 0 = 1
        //   1 ^ 1 = 0 while 1 ^ 0 = 1.
        //   So, in the case of one as operand,
        //   you get the same value, only when 
        //   you add / xor 0 to it.
        // In the case of 0:
        //   0 + 0 = 0 while 0 + 1 = 1
        //   0 ^ 0 = 0 while 0 ^ 1 = 1
        //   So in the case of zero as operand, 
        //   you get the same value when you
        //   add / xor either value (0 or 1) to it
            
        // So the numbers that will work with 
        // 1001000110100 are:
        // 0**0***00*0**
        // where * can be either a zero or a one.
            
        // To calculate the number of permutations: 
        // Take the number of options (zero or one, so two) 
        // to the power of the number of times that option 
        // can be taken, which is the number of zeros in the 
        // binary string of the original number, n.
        
        // The exception here is zero, which has one option
        if (n == 0) return 1;
        
        String binary = Long.toBinaryString(n);
        int zeros = (int) binary.chars()
                        .filter(ch -> ch == '0').count();
        return (long) Math.pow(2, zeros);
    }
}
