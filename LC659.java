//import java 8 streams
import java.util.*;
import java.util.List;
public class LC659 {
        /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    public String encode(List<String> strs) {
        // write your code here
        String s = strs.stream().reduce((a,b) -> a+"&&"+b).get();
        
        return s;
    }

    /*
     * @param str: A string
     * @return: decodes a single string to a list of strings
     */
    public List<String> decode(String str) {
        // write your code here
        List<String> s = Arrays.asList(str.split("&&"));
        return s;
    }

    public static void main(String[] args) {
        List<String> s = Arrays.asList(new String[]{"lint","code","love","you"});
        System.out.println(new LC659().encode(s));
        System.out.println(new LC659().decode("lint&&code&&love&&you"));
    }
}
