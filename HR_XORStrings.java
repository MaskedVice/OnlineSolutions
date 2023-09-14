import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.stream.Stream;

public class HR_XORStrings {
    public static String stringsXOR(String s, String t) {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == (t.charAt(i)))
                res.append("0");
            else
                res.append("1");
        }

        return res.toString();
    }

    public static void main(String[] args) throws IOException {
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();
        String t = bufferedReader.readLine();

        System.out.println(HR_XORStrings.stringsXOR(s,t));

        bufferedReader.close();
    }
}
