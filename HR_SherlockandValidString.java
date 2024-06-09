import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.List;

public class HR_SherlockandValidString {
    public static String isValid(String s) {
        // Write your code here
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> bucket = new HashMap<>();
        s.chars().forEach(x -> {
            if (map.containsKey(x)) {
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        });
        List<Integer> res = new ArrayList<>(map.values());
        Collections.sort(res);

        List<Integer> freq = res.stream().distinct().collect(Collectors.toList());
        if (freq.size() == 1) {
            return "YES";
        } else if (freq.size() > 2) {
            return "NO";
        } else {
            // Res like (1,1,2,2)
            int temp = res.get(0);
            if (temp == 1) {
                res.remove(0);
                if (res.stream().distinct().count() == 1) {
                    return "YES";
                } else {
                    res.add(0, temp);
                }
            }
            else{
                res.set(0, res.get(0) - 1);
                if (res.stream().distinct().count() == 1) {
                    return "YES";
                }
                res.set(0, res.get(0) + 1);
            }

            // Res like (2,2,2,2,3)
            res.set(res.size() - 1, res.get(res.size() - 1) - 1);
            if (res.stream().distinct().count() == 1) {
                return "YES";
            }
            res.set(res.size() - 1, res.get(res.size() - 1) + 1);

            // Res like (1,2,2,2,2)
            res.set(0, res.get(0) - 1);
            if (res.stream().distinct().count() == 1) {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(new HR_SherlockandValidString().isValid("abcdd"));
    }
}
