public class LC2358 {
    public int maximumGroups(int[] grades) {
        // using the iterative summation formula (n+1)n/2 = length of grades
        // n(n+1) = 2 * len
        // n^2 + n - (2 * len) = 0 
        
        // n^2 + n - 12 = 0 => 0 = (n-3)(n+4) -> choose n = 3
        
        
        int len = grades.length;
        
        
        int x = (int)((-1 + Math.sqrt(1 - (4 * (-len * 2)))) / 2);
        return x;
    }
}
