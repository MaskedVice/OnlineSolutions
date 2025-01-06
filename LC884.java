import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class LC884 {
        public String[] uncommonFromSentences(String s1, String s2) {
        Map<String,Integer> countMap = new HashMap<>();
        for(String s : s1.split(" ")){
            countMap.put(s,countMap.getOrDefault(s,0)+1);
        }
        for(String s : s2.split(" ")){
            countMap.put(s,countMap.getOrDefault(s,0)+1);
        }
        List<String> ans = new ArrayList<>();
        for(Map.Entry<String,Integer> entry : countMap.entrySet()){
            if(entry.getValue() % 2 != 0){
                ans.add(entry.getKey());
            }
        }
        String[] ansArr = new String[ans.size()];
        for(int i = 0 ; i < ans.size() ; i++){
            ansArr[i] = ans.get(i);
        }
        return ansArr;
    }


    public static void main(String[] args) {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        String[] ans = new LC884().uncommonFromSentences(s1,s2);
        for(int i = 0 ; i < ans.length ; i++){
            System.out.println(ans[i]);
        }
    }
}
