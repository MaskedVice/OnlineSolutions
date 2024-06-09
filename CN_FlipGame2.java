public class CN_FlipGame2 {
    public static boolean canNinjaWin(String str) {
        // Write your code here.
        return checkNinja(0,0,str,false);
    }


    private static boolean checkNinja(int i,int move, String str, boolean b) {
        if(b == true){
            return true;
        }
        if(i >= str.length() || !str.contains("$$") ){
            if(move%2 == 0){
                return false;
            }
            return true;
        }
        for(int j = 0 ; j < str.length()-1 ; j++){
            if(str.charAt(j) == '$' && str.charAt(j+1) == '$'){
                str = str.substring(0,j) + "**" + str.substring(j+2);
                b = checkNinja(j+1,move+1,str,b);
                if(b) break;
                str = str.substring(0,j) + "$$" + str.substring(j+2);
            }
        }
        return b;
    }


    public static void main(String[] args) {
        String str = "**$$**$";
        System.out.println(canNinjaWin(str));
    }
}
