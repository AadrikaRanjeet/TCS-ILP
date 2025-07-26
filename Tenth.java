import java.util.*;

public class Tenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] word = s.trim().split("\\s+");
        int maxCount = Integer.MIN_VALUE;
        String longestWord = "";

        for (int i = 0; i < word.length; i++) {
            String temp = word[i];
            int count = temp.length();
            if (count > maxCount) {
                maxCount = count;
                longestWord = temp; // ✅ store the actual word
            }
        }

        System.out.println(longestWord); // ✅ print word, not count
        sc.close();
    }
}
