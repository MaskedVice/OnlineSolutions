/**
 * LC2038
 */
public class LC2038 {

    public boolean winnerOfGame(String s) {
        int n = s.length();
        if(n<=2) return false;

        int A = 0;
        int B = 0;

        for(int i=1; i<n-1; i++){
            char ch = s.charAt(i);
            char a = s.charAt(i-1);
            char b = s.charAt(i+1);
            if(ch=='A' && ch==a && ch==b) A++;
            if(ch=='B' && ch==a && ch==b) B++;
        }
        if(A>B) return true;
        else return false;
    }

    // public boolean winnerOfGame(String colors) {
    //     char turn = 'A';
    //     while(true){
    //         String colNew = takeTurn(turn,colors);
    //         if(colNew != colors){
    //             if(turn == 'A'){
    //                 turn = 'B';
    //             } else {
    //                 turn = 'A';
    //             }
    //             colors = colNew;
    //         } else{
    //             break;
    //         }
    //     }
    //     return turn == 'B';
    // }

    // private String takeTurn(char curTurn, String colors){
    //     for(int i = 1 ; i < colors.length()-1 ; i++){
    //         if(colors.charAt(i) == curTurn && colors.charAt(i-1) == curTurn && colors.charAt(i+1) == curTurn){
    //             colors = colors.substring(0,i) + colors.substring(i+1);
    //             return colors;
    //         }    
    //     }
    //     return colors;
    // }

    // public static void main(String[] args) {
    //     LC2038 obj = new LC2038();
    //     System.out.println(obj.winnerOfGame("AAABABB"));
    // }
}