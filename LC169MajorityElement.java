import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LC169MajorityElement {
        public int majorityElement(int[] nums) {
        Map<Integer,Long> map = Arrays.stream(nums).boxed()
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    }
}
