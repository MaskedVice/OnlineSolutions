import java.util.Arrays;

public class CN_MaxLengthWithUniqueCHaracters {
    	public static int stringConcatenation(String[] arr) {
		// Write your code here
		String temp = "";
		return traverse(0,arr,temp,arr.length);
	}

	static int traverse(int i ,String[] arr,String temp ,int n){
		if(i>=n){
			return temp.length();
		}

		int include = 0;
		int exclude = 0;

		if(hasDuplicate(temp,arr[i])){
			exclude = traverse(i+1,arr,temp,n);
		} else{
			exclude = traverse(i+1,arr,temp,n);

			include = traverse(i+1,arr,temp + arr[i],n);
		}

		return Math.max(include,exclude);
	}


	static boolean hasDuplicate(String s1, String s2){
		int[] seen = new int[26];
		Arrays.fill(seen,0);
		for(char c : s1.toCharArray()){
			if(seen[c-'a'] > 0){
				return true;
			}
			seen[c -'a']++;
		}

		for(char c : s2.toCharArray()){
			if(seen[c-'a'] > 0){
				return true;
			}
            seen[c -'a']++;
		}
		return false;

	}

    public static void main(String[] args) {
        String[] arr = {"yy", "bkhwmpbiisbldzknpm"};
        System.out.println(stringConcatenation(arr));
    }
}
