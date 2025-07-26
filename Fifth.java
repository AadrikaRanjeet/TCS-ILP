import java.util.*;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                char c = s.charAt(i - 1); // if the first character itself is a space
                if (Character.isLetter(c)) {
                    result.append(c);
                }
            }
        }

        if (s.length() > 0 && Character.isLetter(s.charAt(s.length() - 1))) {
            result.append(s.charAt(s.length() - 1));
        }
        System.out.println(result);
        sc.close();
    }
}
