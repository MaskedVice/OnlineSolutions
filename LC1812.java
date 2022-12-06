/**
 * LC1812
 */
public class LC1812 {

    public boolean squareIsWhite(String coordinates) {
        boolean isXOdd = coordinates.charAt(0)%2 != 0;
        boolean isYOdd = coordinates.charAt(1)%2 != 0;
        if((isXOdd && isYOdd) || (!isXOdd && !isYOdd))
        {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        LC1812 a = new LC1812();
        System.out.println((int) 'a');
        System.out.println(a.squareIsWhite("b2"));
    }
}