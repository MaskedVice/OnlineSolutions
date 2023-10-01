import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HR_GridChallenge {
    public static String gridChallenge(ArrayList<String> grid) {
        // Write your code here
        
        for (int i = 0; i < grid.size(); i++) {
            grid.set(i, Stream.of( grid.get(i).split("") )
                .sorted()
                .collect(Collectors.joining()));
        }
        for (int i = 0; i < grid.get(0).length(); i++) {
            for (int j = 0; j < grid.size(); j++) {
                if(grid.get(j).charAt(i) > grid.get(j+1).charAt(i)) {
                    return "NO";
                }
            }
        }
        return "YES";
    }
}
