public class LC58LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] str = s.split("  *");
        if(str.length == 0) return 0;
        return str[str.length-1].length();
    }

    public static void main(String[] args) {
        LC58LengthOfLastWord obj = new LC58LengthOfLastWord();
        String s = "   fly me   to   the moon  ";
        System.out.println(obj.lengthOfLastWord(s));
    }
}
