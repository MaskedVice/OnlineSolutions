public class HR_LookAndSaySequence {
    /**
     * Generates the look-and-say sequence up to the given number.
     *
     * @param  n  the number indicating how many terms of the look-and-say sequence to generate
     * @return    the look-and-say sequence up to the given number
     */
    public static String lookAndSaySequence(int n) {
		// Write your code here.
		String start = "1";
		for( int i = 0 ; i < n ; i++){
			StringBuilder s = new StringBuilder();
            int j = 0;
            while(j<start.length()){
                int count = 1;
                while(j+1<start.length() && start.charAt(j)==start.charAt(j+1)){
                    count++;
                    j++;
                }
                s.append(count).append(start.charAt(j));
                j++;
            }
            start = s.toString();
		}
        return start;
	}


    /**
     * Generates the look-and-say sequence recursively up to the given number.
     *
     * @param  n  the number specifying the length of the sequence
     */
    public static String lookAndSaySequenceRecursive(int n){
        if(n==1){
            return "1";
        }
        int j = 0;
        String ans = lookAndSaySequenceRecursive(n-1);
        StringBuilder temp = new StringBuilder();
        while(j<ans.length()){
            int count = 1;
            while(j+1<ans.length() && ans.charAt(j)==ans.charAt(j+1)){
                count++;
                j++;
            }
            temp.append(count).append(ans.charAt(j));
            j++;
        }
        return temp.toString();
    }
    public static void main(String[] args) {
        System.out.println(lookAndSaySequenceRecursive(3));
    }
}
