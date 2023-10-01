import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.print.DocFlavor.STRING;

public class TestRemote {
    String urll = "https://jsonmock.hackerrank.com/api/tvseries?page=";
    public String APICall() throws IOException {
        URL url = new URL(urll);

        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        int numPages = con.getHeaderFieldInt("total_pages", responseCode);
        System.out.println(numPages);
        BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        String res = sb.toString();
        br.close();

        return String.valueOf(numPages);
        
    }
    public static void main(String[] args) {
        try {
            System.out.println(new TestRemote().APICall());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
