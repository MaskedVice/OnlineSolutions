public class HR_Panagram {
    public static String pangrams(String s) {
        // Write your code here
        return s.toLowerCase().replace(" ", "").chars().distinct().count() == 26 ? "pangram" : "not pangram";
    }

    public static void main(String[] args) {
        String s = "a";
        System.out.println(pangrams(s));
    }
}
