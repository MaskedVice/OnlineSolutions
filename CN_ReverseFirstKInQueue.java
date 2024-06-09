import java.util.ArrayList;
import java.util.Queue;
import java.util.List;

public class CN_ReverseFirstKInQueue {
    public static Queue<Integer> reverseElements(Queue<Integer> q, int k) 
    {
        // Write your code here.
        List<Integer> l = new ArrayList<>();
        while(k>0){
        l.add(0,q.remove());
            k--;
        }
        while(!q.isEmpty()){
        l.add(q.remove());
        }
        q.addAll(l);
        return q;
    }

    public static void main(String[] args) {

        Queue<Integer> q = new java.util.ArrayDeque<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q = reverseElements(q, 3);
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
