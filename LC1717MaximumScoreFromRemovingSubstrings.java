import java.util.ArrayList;
import java.util.List;

public class LC1717MaximumScoreFromRemovingSubstrings {
    public int maximumGain(String s, int x, int y) {
        if(!s.contains("ab") && !s.contains("ba")){
            return 0;
        }
        return remove(s,x,y);
    }

    private int remove(String s,int ab,int ba) {
        if(s.length() == 0 ||(!s.contains("ab") && !s.contains("ba"))){
            return 0;
        }
        int le = 0 , ri = 0;
        if(s.contains("ab")){
            int index = s.indexOf("ab");
            le = remove(s.substring(0,index) + s.substring(index+2),ab,ba) + ab;
        }
        if(s.contains("ba")){
            int index = s.indexOf("ba");
            ri = remove(s.substring(0,index) + s.substring(index+2),ab,ba) + ba;
        }
        return Math.max(le,ri);
    }


    public static void main(String[] args) {
        LC1717MaximumScoreFromRemovingSubstrings a = new LC1717MaximumScoreFromRemovingSubstrings();
        System.out.println(a.maximumGain("aabbaaxybbaabb",4,5));
    }
}
