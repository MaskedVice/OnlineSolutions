public class HackerEarth_OneRoomToAnother {
    public static int getpath(int start,int[] rooms)
    {
        int c= 1;
        int toReach = start;
        start = rooms[start];
        while(toReach != rooms[start])
        {
            c++;
            start = rooms[start];
        }
        return c++;
    }
    public static void main(String[] args) {
        getpath(1,new int[]{0,2,3,4,1});
    }
}
