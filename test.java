import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.GZIPInputStream;

public class test {
    private static void readAndUnzipFile(String gzippedFilePath) throws IOException {
        try (FileInputStream fis = new FileInputStream(gzippedFilePath);
             GZIPInputStream gzis = new GZIPInputStream(fis);
             InputStreamReader isr = new InputStreamReader(gzis);
             BufferedReader br = new BufferedReader(isr)) {
            int count = 0;
            String line;
            while ((line = br.readLine()) != null) {
                if(line.contains("NSE_EQ")){
                    System.out.println(line.split(",")[0]);
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    public static void main(String[] args) {
        String path = "C:\\Users\\snghj\\Downloads\\NSE.csv.gz";
        try {
            readAndUnzipFile(path);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
