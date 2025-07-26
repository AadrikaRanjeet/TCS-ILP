import java.util.*;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Input = sc.nextLine();
        char c = sc.next().charAt(0);

        for (int i = 0; i < Input.length(); i++) {
            if (Input.charAt(i) == c) {
                System.out.println(i);
                break;
            }
        }
        System.out.println("Not found");
        sc.close();
    }
}
