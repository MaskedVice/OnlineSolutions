import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class LC874 {
    public int robotSim(int[] commands, int[][] obstacles) {
        Map<Integer,List<Integer>> obs = new HashMap<>();
        for(int[] i : obstacles){
            if(obs.containsKey(i[0])){
                obs.get(i[0]).add(i[1]);
            } else{
                List<Integer> l = new ArrayList<>();
                l.add(i[1]);
                obs.put(i[0],l);
            }
        }
        /*
        0 North
        1 East
        2 South
        3 West

        */
        int maxDist = Integer.MIN_VALUE;
        int direction = 0;
        int[] pos = new int[]{0,0};

        for(int i = 0 ; i < commands.length ; i++){
            if(commands[i] < 0){
                direction = changeDirection(commands[i], direction);
            } else{
                pos = move(pos, commands[i], direction, obs);
                int dist = pos[0]*pos[0] + pos[1]*pos[1];
                if(dist > maxDist) maxDist = dist;
            }
        }
        return maxDist;
    }


    private int[] move(int[] curPos, int noOfSteps, int direction, Map<Integer,List<Integer>> obs){
        int i = 1;
        switch(direction){
            //d - 0
            case 0:
                while(i<=noOfSteps){
                    int x = curPos[0],y = curPos[1];
                    if(obs.containsKey(x) &&  obs.get(x).contains(y + 1)) break;
                    curPos[1]++;i++;
                }
                break;

            //d - 1
            case 1:
                while(i<=noOfSteps){
                    int x = curPos[0],y = curPos[1];
                    if(obs.containsKey(x + 1) &&  obs.get(x + 1).contains(y)) break;
                    curPos[0]++;i++;
                }
                break;

            //d - 2
            case 2:
                while(i<=noOfSteps){
                    int x = curPos[0],y = curPos[1];
                    if(obs.containsKey(x) &&  obs.get(x).contains(y - 1)) break;
                    curPos[1]--;i++;
                }
                break;
            //d - 3
            case 3:
                while(i<=noOfSteps){
                    int x = curPos[0],y = curPos[1];
                    if(obs.containsKey(x - 1) &&  obs.get(x - 1).contains(y)) break;
                    curPos[0]--;i++;
                }
                break;  
        }
        return curPos;
    }


    private int changeDirection(int command, int curDirection){
        if(command == -1){
            if(curDirection == 3) return 0;
            return curDirection + 1;
        }
        if(command == -2){
            if(curDirection == 0) return 3;
            return curDirection - 1;
        }

        return curDirection;
    }

    public static void main(String[] args) {
        LC874 a = new LC874();
        // commands = [-2,-1,-2,3,7]
        // obstacles = [[1,-3],[2,-3],[4,0],[-2,5],[-5,2],[0,0],[4,-4],[-2,-5],[-1,-2],[0,2]]

        int[] commands = {-2,-1,-2,3,7};
        int[][] obstacles = {{1,-3},{2,-3},{4,0},{-2,5},{-5,2},{0,0},{4,-4},{-2,-5},{-1,-2},{0,2}};
        System.out.println(a.robotSim(commands, obstacles));
    }
}
