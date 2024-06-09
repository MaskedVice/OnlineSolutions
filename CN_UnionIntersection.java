import java.util.ArrayList;

public class CN_UnionIntersection {
    public static ArrayList<Integer> findSimilarity(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m) {
    // Write your code here.
        int intersection = (int) arr1.stream().filter(arr2::contains).count();
        int union = (int) (arr1.stream().count() + arr2.stream().count() - intersection);
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add( union);
        ans.add(intersection);
        return ans;
    }
}
