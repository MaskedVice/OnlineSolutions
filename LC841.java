import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class LC841{
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        for(int i = 0 ; i < rooms.size() ; i ++)
        {
            if(rooms.get(i).contains(i))return false;
        }
        
        boolean[] visited = new boolean[rooms.size()];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0] = true;
        while(!q.isEmpty())
        {
            int cur = q.poll();
            for (int room : rooms.get(cur)) {
                if(!visited[room])
                {
                    q.add(room);
                    visited[room] = true;
                }
            }
        }
        
        for(boolean b : visited) {
            if(!b)return false;
        }
        return true;
    }
}