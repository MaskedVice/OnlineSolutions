import java.util.HashSet;
import java.util.Set;

public class LC1079 {
    public static void main(String[] args) {
        LC1079 g = new LC1079();
        g.numTilePossibilities("AAB");
    }
    public int numTilePossibilities(String tiles) {
        boolean[]a = new boolean[tiles.length()+1];
        Set<String> s = new HashSet<>();
        Backtrack(a,0,tiles.length(),s,tiles);
        return s.size();
    }

    private void Backtrack(boolean[] a, int k, int length, Set<String> s, String tiles) {
        boolean[] c = new boolean[length+1];
        int[] nc = new int[1];
        if(isSolution(k,length))
        {
            processSolution(a,k,length,s,tiles);
        }
        else{
            k++;
            constructCandidates(a,k,length,c,nc);
            for (int i = 0 ; i < nc[0] ; i++) {
                a[k] = c[i];
                Backtrack(a, k, length, s, tiles);
            }
        }
    }
    private void processSolution(boolean[] a, int k, int length, Set<String> s, String tiles) {
        StringBuilder st = new StringBuilder();
            for (int i = 0; i < length; i++) {
                if(a[i+1])
                {
                    st.append(tiles.charAt(i));
                }
            }
            s.add(st.toString());
    }
    private void constructCandidates(boolean[] a, int k, int length, boolean[] c, int[] nc) {
        c[0] = true;
        c[1] = false;
        nc[0] = 2;
    }
    private boolean isSolution(int k, int length) {
        return k==length;
    }
}
