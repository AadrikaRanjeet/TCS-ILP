import java.util.*;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        Function(s, count);
        sc.close();
    }

    public static void Function(String s, int count) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
