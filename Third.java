// package 2025.sorting.TCS;

import java.util.*;

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String temp = "";
        Fun(s, temp);
        sc.close();
    }

    public static void Fun(String s, String temp) {

        for (int i = 0; i < s.length(); i++) {
            if (temp.indexOf(s.charAt(i)) == -1) {
                temp = temp + s.charAt(i);
            }
        }
        System.out.println(temp);
    }
}
