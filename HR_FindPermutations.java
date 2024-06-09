import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
public class HR_FindPermutations {
    public static List<String> findPermutations(String s) {
        // Write your code here.
        List<String> ans = new ArrayList<>();
        List<String> options = new ArrayList<>();
        List<Boolean> taken = new ArrayList<>();
        for(int i = 0 ; i < s.length() ; i++){
            taken.add(false);
        }

        FindAllPermutationsWithoutUsingExtraSpace(0, ans, s);
        return ans;
    }

    /**
     * Generate all permutations of a given string using extra space.
     *
     * @param  i         the current index
     * @param  s         the input string
     * @param  ans       the list to store the permutations
     * @param  options   the list to store the current permutation options
     * @param  taken     the list to track if a character is taken or not
     */
    private static void FindAllPermutationsUsingExtraSpace(int i, String s, List<String> ans, List<String> options, List<Boolean> taken) {
        if(i == s.length()){
            ans.add(options.stream().collect(Collectors.joining()).toString());
        }
        for(int j = 0 ;  j < s.length() ; j++ ){
            if(!taken.get(j)){
                taken.set(j, true);
                options.add(String.valueOf(s.charAt(j)));
                FindAllPermutationsUsingExtraSpace(i+1, s, ans, options, taken);
                taken.set(j, false);
                options.remove(options.size()-1);
            }
        }
    }

    /**
     * Finds all permutations of a given string without using extra space.
     *
     * @param  i   the current index in the string
     * @param  ans the list to store all the permutations
     * @param  s   the input string
     */
    public static void FindAllPermutationsWithoutUsingExtraSpace(int i , List<String> ans, String s){
        if(i == s.length()){
            ans.add(s);
            return;
        }
        for(int j = i ; j < s.length() ; j++){
            s = swap(i,j,s);
            FindAllPermutationsWithoutUsingExtraSpace(i+1, ans, s);
            s = swap(i,j,s);
        }
    }
    //WRITE FUNCTION SWAP TO SWAP 2 CHARACHTERS OF A STRING

    public static String swap(int a, int b , String s){
        char[] temp = s.toCharArray();
        char t = temp[a];
        temp[a] = temp[b];
        temp[b] = t;
        s = String.valueOf(temp);
        return s;
    }

    public static void main(String[] args) {
        for (String string : findPermutations("abc")) {
            System.out.println(string);
        }
    }
}
