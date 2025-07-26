import java.util.*;

public class Ninth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        int sum = 0;

        while (digit > 0) {
            int n = digit % 10;
            sum += n;
            digit = digit / 10;
        }
        if (sum % 3 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        sc.close();
    }
}
