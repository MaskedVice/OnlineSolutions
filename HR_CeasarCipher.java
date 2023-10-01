import java.util.stream.Collectors;

public class HR_CeasarCipher {

    public static String caesarCipher(String s, int k) {
        k = k % 26;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                int newChar = c + k;
                if (Character.isLowerCase(c) && newChar > 'z') {
                    newChar -= 26;
                } else if (Character.isUpperCase(c) && newChar > 'Z') {
                    newChar -= 26;
                }
                sb.append((char) newChar);
            } else {
                sb.append(c);
            }

        }
        return sb.toString();
    }

    public static String caesarCipher1(String s, int k) {
        k = k % 26;
        final int d = k;
        return s.chars()
                .mapToObj(c -> {
                    if (Character.isLetter(c)) {
                        int newChar = c + d;
                        if (Character.isLowerCase(c) && newChar > 'z') {
                            newChar -= 26;
                        } else if (Character.isUpperCase(c) && newChar > 'Z') {
                            newChar -= 26;
                        }
                        return String.valueOf((char) newChar);
                    } else {
                        return String.valueOf((char) c);
                    }
                })
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(caesarCipher("www.abc.xy", 87));
    }

}
