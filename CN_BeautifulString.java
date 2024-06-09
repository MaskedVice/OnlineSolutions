public class CN_BeautifulString {
    public static int makeBeautiful(String str) {
        
        char[] inputS = str.toCharArray();

        int res1 = startsWith1(inputS);
        int res2 = startsWith0(inputS);

        return Math.min(res1,res2);
    }
    private static int startsWith1(char[] c){
        int count = 0;
        for(int i=0;i<c.length;i++){
            if(i%2 == 0 && c[i] == '0'){
                count++;
            }
            if(i%2 == 1 && c[i] == '1'){
                count++;
            }
        }
        return count;
    }

    private static int startsWith0(char[] c){
        int count = 0;
        for(int i=0;i<c.length;i++){
            if(i%2 == 0 && c[i] == '1'){
                count++;
            }
            if(i%2 == 1 && c[i] == '0'){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {

        String s = "01010010101";
        System.out.println(makeBeautiful(s));
    }
}
