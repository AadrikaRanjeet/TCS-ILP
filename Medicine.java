import java.util.*;

class Solution {
    String MedicinName;
    String batch;
    String disease;
    int price;

    public Solution(String MedicinName, String batch, String disease, int price) {
        this.MedicinName = MedicinName;
        this.batch = batch;
        this.disease = disease;
        this.price = price;
    }

    public String getDisease() {
        return disease;
    }

    public String getMedicinName() {
        return MedicinName;
    }

    public String getBatch() {
        return batch;
    }

    public int getPrice() {
        return price;
    }

}

public class Medicine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution[] obj = new Solution[4];

        for (int i = 0; i < obj.length; i++) {
            String n = sc.nextLine();
            String b = sc.nextLine();
            String d = sc.nextLine();
            int p = sc.nextInt();
            sc.nextLine();
            obj[i] = new Solution(n, b, d, p);
        }
        String disease = sc.nextLine();
        int[] temp = getPriceByDisease(obj, disease);
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
        sc.close();
    }

    public static int[] getPriceByDisease(Solution[] obj, String d) {
        int[] a = new int[4];
        for (int i = 0; i < obj.length; i++) {
            if (obj[i].getDisease().equals(d)) {
                a[i] = obj[i].getPrice();
            }
        }
        Arrays.sort(a);
        return a;
    }
}
