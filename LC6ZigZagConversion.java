import java.util.ArrayList;
import java.util.List;

public class LC6ZigZagConversion {
    public String convert(String s, int numRows) {
        List<String> rows = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            rows.add("");
        }

        int curRow = 0,i = 0;
        while(i<s.length()){
            rows.set(curRow, rows.get(curRow) + String.valueOf(s.charAt(i)));
            i++;curRow++;
            if(curRow >= numRows){
                curRow = 0;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String row : rows) {
            sb.append(row);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LC6ZigZagConversion obj = new LC6ZigZagConversion();
        System.out.println(obj.convert("PAYPALISHIRING",3));
    }
}
