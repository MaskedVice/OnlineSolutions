public class LC1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        int nonConsistentCounter = 0;
        for (String string : words) {
            for (Character c : string.toCharArray()) {
                if(!allowed.contains(c.toString()))
                {
                    nonConsistentCounter++;
                    break;
                }
            }
        }
        return words.length-nonConsistentCounter;
    }

    public static void main(String[] args) {
        LC1684 a = new LC1684();
       System.out.println(a.countConsistentStrings("abc", new String[]{"a","b","c","ab","ac","bc","abc"}));
    }
}
