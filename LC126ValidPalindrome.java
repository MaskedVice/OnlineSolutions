public class LC126ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        char cl,cr;
        while(l<=r)
        {
            cl = s.charAt(l);
            cr = s.charAt(r);
            if(!Character.isLetterOrDigit(cl))
            {
                l++;
            }else if (!Character.isLetterOrDigit(cr))
            {
                r--;
            }
            else{
                if(Character.toLowerCase(cr) != Character.toLowerCase(cl)){
                    return false;
                }
                l++;
                r--;  
            }
        }
        return true;
    }
    public static void main(String[] args) {
        isPalindrome("A man, a plan, a canal: Panama");
    }
}
