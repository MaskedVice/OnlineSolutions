import java.util.Arrays;

public class LC2011 {
    public static int finalValueAfterOperations(String[] operations) {
        int[] x = {0};
        Arrays.stream(operations).parallel().forEach(
            operation -> {
                int a = 0;
                if (operation.equals("++X") || operation.equals("X++")) {
                    ++x[0];
                } else if (operation.equals("--X") || operation.equals("X--")) {
                    --x[0];
                }
            }
        );
        return x[0];
    }

    public static void main(String[] args) {
        System.out.println(finalValueAfterOperations(new String[]{"X--","X--","X++","++X","X--","++X","X--","X--","--X","--X","--X","X++","++X","--X","++X","--X","--X","X--","++X","++X","X--","X--","X--","X--","X--","X--","--X","X++","++X","X--","X++","X--","X--","X--","X++","X--","--X","--X"}));
    }
}
