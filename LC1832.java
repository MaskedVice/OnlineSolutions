import java.util.HashSet;

/**
 * LC1832
 */
public class LC1832 {

    public boolean checkIfPangram(String sentence) {
        HashSet<Double> h = new HashSet<>();
        sentence.chars().asDoubleStream().forEach(c -> h.add(c));
        return h.size()==26;
    }
}