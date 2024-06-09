import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HR_TImeConversion {
     /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        DateFormat df = new SimpleDateFormat("hh:mm:ssaa");

        //Date/time pattern of desired output date (24 Hours format HH - Used for 24 hours)
        DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
        Date date = null;
        String output = null;

        //Returns Date object
        try {
            date = df.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //old date format to new date format
        output = outputformat.format(date);
        System.out.println(output);

        return output;

    }
     public static void main(String[] args) throws IOException {

        String s = "12:45:54PM";

        String result = HR_TImeConversion.timeConversion(s);
        System.out.println(result);
    }

}