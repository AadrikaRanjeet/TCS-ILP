import java.util.*;

public class Eighth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i += 2) {
            System.out.println(s.charAt(i));
        }

        sc.close();
    }
}