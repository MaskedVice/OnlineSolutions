public class HR_RecursiveDigitSum {
    public static int superDigit(String n, int k) {
        // Write your code here 
        Long sum = 0L;
        for (int i = 0; i < n.length(); i++) {
            sum += Character.getNumericValue(n.charAt(i));
        }
        sum*=k;
        n = String.valueOf(sum);
        while (n.length()>1) {
            int s = 0;
            for (int i = 0; i < n.length(); i++) {
                s += Character.getNumericValue(n.charAt(i));
            }
            n = String.valueOf(s);
        }
        
        return Integer.parseInt(n);
       
    }

    public static void main(String[] args) {
        System.out.println(superDigit("9875",4));
    }
}
