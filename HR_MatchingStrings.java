import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class HR_MatchingStrings {
     /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    // Write your code here
        List<Integer> res = new ArrayList<>();
        for (int i = 0 ; i < queries.size() ; i++){
            int count = 0;
            String q = queries.get(i);
            for (String s : strings) {
                if(s.contains(q)){
                    count++;
                }
           
            }
            res.add(count);
        }
        return res;
    }
    public static void main(String[] args) throws IOException {

        List<String> strings = Arrays.asList(new String[]{"aba", "aa", "ad", "vcd", "aba"});
        List<String> queries = Arrays.asList(new String[]{"aba", "aa", "ad", "vcd", "aba"});
        List<Integer> res = HR_MatchingStrings.matchingStrings(strings, queries);
        res.stream().forEach(System.out::println);

    }
}
