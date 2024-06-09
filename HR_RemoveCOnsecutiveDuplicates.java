public class HR_RemoveCOnsecutiveDuplicates {
    public static String removeConsecutiveDuplicates(String s) {

		// Write your code here
		int i = 0 ;
		StringBuilder sb = new StringBuilder();
		getString(i,s,sb);
		return sb.toString();
	}

	private static void getString(int i , String s , StringBuilder sb){
		if(i == s.length()) return;
		if(i>0 && s.charAt(i) != s.charAt(i-1)){
			sb.append(s.charAt(i));
		} else if (i==0) {
			sb.append(s.charAt(i));
		}
		getString(i+1, s, sb);
	}

    public static void main(String[] args) {
		String s = "aaabcccd";
		System.out.println(removeConsecutiveDuplicates(s));
	}
}
