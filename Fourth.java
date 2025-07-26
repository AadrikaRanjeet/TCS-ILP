
/*wap to compute the number of spaces and characters in string */

import java.util.*;

public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int spaceCount = 0;
        int charCount = 0;

        if (s.isEmpty()) {
            System.out.println(0);
            return;

        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                spaceCount++;
            } else {
                charCount++;
            }
        }
        System.out.println(spaceCount);
        System.out.println(charCount);
        sc.close();
    }
}
