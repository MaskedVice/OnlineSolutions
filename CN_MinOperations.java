import java.util.HashMap;
import java.util.Map;

public class CN_MinOperations {
    	public static int minimumOperation(int[] arr, int n) {
		// Write your code here.
		Map<Integer,Integer> map = new HashMap<>();
		for (int i : arr) {
			if(map.containsKey(i)){
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		int max = 0;
		for (Map.Entry<Integer,Integer> i : map.entrySet()) {
			if(i.getValue()>max){
				max = i.getValue();
			}
		}

		return n-max;
	}

    public static void main(String[] args) {
        int[] arr = {1,1,3};
        int n = 3;
        System.out.println(minimumOperation(arr, n));
    }
}
