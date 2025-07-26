import java.util.*;

public class Seventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] st = s.trim().split("\\s+");
        for (int i = 0; i < st.length; i++) {
            if (st.length > 0) {
                char c = st[i].charAt(0);
                if (isVowel(c)) {
                    System.out.println(c);
                }

            }
            sc.close();
        }
    }

    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}

/*
 * String[] temp = s.split(" ");
 * for (int i = 0; i < temp.length; i++) {
 * String word = temp[i];
 * if (word.length() > 0) { // avoid index error if word is empty
 * char ch = word.charAt(0);
 * if (ch == 'a' || ch == 'A') {
 * System.out.println(ch);
 * }
 * }
 * }
 */