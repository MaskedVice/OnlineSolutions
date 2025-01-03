public class LC2028_MissingObservations {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int[] ans = new int[n];
        int sum = mean * (n + rolls.length);
        for(int i = 0; i < rolls.length; i++){
            sum -= rolls[i];
        }
        // Find n numbers between 1-6 such that sum = sum
        int d = sum / n;
        int r = sum % n;
        for(int i = 0; i < n; i++){
            ans[i] = d + (i < r ? 1 : 0);
        }
        return ans;
    }


    public static void main(String[] args) {  
        LC2028_MissingObservations obj = new LC2028_MissingObservations();
        int[] rolls = {1,5,6};
        int mean = 3;
        int n = 4;
        int[] ans = obj.missingRolls(rolls, mean, n);
        for(int i = 0; i < ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}
