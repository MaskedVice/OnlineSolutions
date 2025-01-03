import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LC274_HIndex {
    public int hIndex(int[] citations) {
       //counting sort
       int[] count = new int[citations.length+1];
       for(int i=0;i<citations.length;i++){
           if(citations[i]>=citations.length){
               count[citations.length]++;
           }
           else{
               count[citations[i]]++;
           }
       }
       int sum = 0;
       for(int i=citations.length;i>=0;i--){
           sum+=count[i];
           if(sum>=i){
               return i;
           }
       }
       return 0;
    }
    public static void main(String[] args) {
        int[] citations = {100};
        LC274_HIndex a = new LC274_HIndex();
        System.out.println(a.hIndex(citations));
    }
}
