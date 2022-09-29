import java.util.*;

class LC658FindKClosestElements {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
		int right = arr.length - 1;
		while (right - left >= k) {
			if (Math.abs(arr[left] - x) > Math.abs(arr[right] - x)) {
				left++;
			} else {
				right--;
			}
		}
		List<Integer> result = new ArrayList<>(k);
		for (int i = left; i <= right; i++) {
			result.add(arr[i]);
		}
		return result;
    }

    public static void main(String[] args) {
        findClosestElements(new int[] {0,0,1,2,3,3,4,7,7,8},3,5);
    }
}
