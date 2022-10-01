import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LC218TheSkylineProblem {
    public static List<List<Integer>> getSkyline(int[][] buildings) {
        int n = buildings[buildings.length-1][1];
        int start = buildings[0][0];
        List<List<Integer>> ansf = new ArrayList<>();
        int[] ans = new int[n];
        for (int[] b : buildings) {
            for(int i = b[0] ; i < b[1] ; i++)
            {
                if(ans[i]<b[2])
                {
                    ans[i] = b[2];
                }
            }  
        }
        for(int i = start ; i <=n ; i++)
        {
            List<Integer> t = new ArrayList<>();
            if(i == n)
            {
                t.add(i);
                t.add(0);
                ansf.add(t);
            }
            else{
                if(i==start){
                    t.add(i);
                    t.add(ans[i]);
                    ansf.add(t);
                }
                else if(ans[i]!= ans[i-1])
                {
                    t.add(i);
                    t.add(ans[i]);
                    ansf.add(t);
                }
            }

            
        }
        return ansf;
    }

    public static void main(String[] args) {
        getSkyline(new int[][]{{2,9,10},{3,7,15},{5,12,12},{15,20,10},{19,24,8}});
    }
}
class SkylineCompare implements Comparator<int[]>{
    public int compare(int[] l1 , int[] l2)
    {
        return l1[2]-l2[2];
    }

}
