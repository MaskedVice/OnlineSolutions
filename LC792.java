import java.util.Arrays;

public class LC792 {
    public int numMatchingSubseq(String s, String[] words) {
        int counter = 0;
        int [] sampleSpace = new int[26];
        for (int i = 0; i < sampleSpace.length; i++) {
            sampleSpace[i] = 0;
        }
        for (int i : s.toCharArray()) {
            sampleSpace[i-97]++;
        }

        for (String  word : words) {
            int[] sample = Arrays.copyOf(sampleSpace,26);
            word.chars().forEach(x->sample[x-97]--);
            if(Arrays.stream(sample).filter(x->x<0).count() == 0)
            {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        LC792 a = new LC792();
        a.numMatchingSubseq("dsahjpjauf",new String[]{"ahjpjau","ja","ahbwzgqnuk","tnmlanowax"});
    }
}
