import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LC692 {
    
    public List<String> topKFrequent(String[] words, int k) {
        List<Word> s = new ArrayList<>();
        for (String word : words) {
            addToList(s,word);
        }
        Collections.sort(s,new Comparator<Word>() {
            @Override
            public int compare(Word h1, Word h2) {
                return h1.freq-h2.freq != 0 ? h2.freq-h1.freq : h1.word.compareTo(h2.word); 
            }
        });
        List<String> ans = s.subList(0, k).stream().map(t ->t.word).collect(Collectors.toList());
        return ans;
    }

    private void addToList(List<Word> s, String w1) {
        if(!s.isEmpty())
        {
            for (Word w : s) {
                if(w.word.equals(w1))
                {
                    w.freq= w.freq+1;
                    return;
                }
            }
            s.add(new Word(w1, 1));
        }
        else{
            s.add(new Word(w1, 1));
        }
        
    }

    public static void main(String[] args) {
        LC692 a = new LC692();
        System.out.println(a.topKFrequent(new String[]{"i","love","leetcode","i","love","coding"}, 2).toString());
    }
}
class Word{
    String word;
    int freq;
    public Word(String w,int f)
    {
        this.word = w;
        this.freq = f;
    }
}