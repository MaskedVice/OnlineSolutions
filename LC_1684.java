import java.util.Arrays;

public class LC_1684 {
        public int countConsistentStrings(String allowed, String[] words) {
        return (int) Arrays.stream(words).filter(x-> {
            for(int i = 0; i < allowed.length(); i++) {
                if(!x.contains(allowed.charAt(i)+"")) {
                    return false;
                }
            }
            return true;
        }).count();
    }

    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        LC_1684 obj = new LC_1684();
        System.out.println(obj.countConsistentStrings(allowed,words));
    }
}
