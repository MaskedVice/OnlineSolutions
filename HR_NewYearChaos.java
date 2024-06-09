import java.util.List;
import java.util.*;

public class HR_NewYearChaos {
    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        int min_Bribe = 0;
        int i = q.size() - 1;
        while (i > 0) {
            if (i + 1 == q.get(i)) {
                i--;
            } else {
                if (q.get(i-1) - 1 == i) {
                    min_Bribe++;
                    Collections.swap(q, i, i - 1);
                } else if (q.get(i - 2) - 1 == i) {
                    min_Bribe += 2;
                    int temp = q.remove(i-2);
                    q.add(i,temp);
                } else {
                    System.out.println("Too chaotic");
                    return;
                }
                System.out.println(q.toString());
            }
        }
        System.out.println(min_Bribe);
    }
    public static void minimumBribes1(List<Integer> q) {
        int counter = 0;
        int temp;
        for (int i = q.size() - 2; i >= 0; i--) {
            int diff = q.get(i) - i - 1;
            if (diff > 2) {
                System.out.println("Too chaotic");
                return;
            }
            while (diff > 0) {
                diff--;
                counter++;
                temp = q.get(i + 1);
                q.set(i + 1, q.get(i));
                q.set(i, temp);
                if(diff == 1) i++;
            }
            System.out.println(q.toString());
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        List<Integer> q = List.of(1, 2, 5, 3, 7, 8, 6, 4);
        minimumBribes(new ArrayList<>(q));
    }
}
