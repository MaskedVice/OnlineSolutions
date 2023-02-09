import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class LC2013 {

    int[][] cntPoints = new int[1001][1001];
    List<int[]> points = new ArrayList<>();

    public void add(int[] p) {
        cntPoints[p[0]][p[1]] += 1;
        points.add(p);
    }

    public int count(int[] p1) {
        int x1 = p1[0], y1 = p1[1], ans = 0;
        for (int[] p3 : points) {
            int x3 = p3[0], y3 = p3[1];
            if (Math.abs(x1-x3) == 0 || Math.abs(x1-x3) != Math.abs(y1-y3))
                continue; // Skip empty square or invalid square point!
            ans += cntPoints[x1][y3] * cntPoints[x3][y1];
        }
        return ans;
    }

    public static void main(String[] args) {
        LC2013 a = new LC2013();
        a.add(new int[] {419,351});
        a.add(new int[] {798,351});
        a.add(new int[] {798,730});

        a.count(new int[]{419,730});
        a.count(new int []{14,8});
        a.add(new int [] {11,2});
        a.count(new int []{11,10});
    }
}


