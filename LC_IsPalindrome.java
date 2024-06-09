public class LC_IsPalindrome {
    public boolean isPalindrome(String s) {
        if(s.trim().isEmpty()) return true;

        int i = 0,j = s.length()-1;
        while(i<=j){
            while(i <= j && (s.charAt(i) == ' ' || !Character.isAlphabetic(s.charAt(i)))){
                i++;
            }
            char front = Character.toLowerCase(s.charAt(i));

            while(i <= j && (s.charAt(j) == ' ' || !Character.isAlphabetic(s.charAt(j)))){
                j--;
            }
            char back = Character.toLowerCase(s.charAt(j));
            if(front != back){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        LC_IsPalindrome obj = new LC_IsPalindrome();
        System.out.println(obj.isPalindrome(s));
    }
}
