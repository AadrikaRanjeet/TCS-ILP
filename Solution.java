import java.util.*;

class Phone {
    int phoneId;
    String os;
    String brand;
    int price;

    public Phone(int phoneId, String os, String brand, int price) {
        this.phoneId = phoneId;
        this.price = price;
        this.os = os;
        this.brand = brand;
    }

    public int getPhoneId() {
        return phoneId;
    }

    public String getBrand() {
        return brand;
    }

    public String getOs() {
        return os;
    }

    public int getPrice() {
        return price;
    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone[] phoneObj = new Phone[4];

        for (int i = 0; i < phoneObj.length; i++) {
            int phoneId = sc.nextInt();
            sc.nextLine();
            String os = sc.nextLine();
            String Brand = sc.nextLine();
            int price = sc.nextInt();
            while (price <= 0) {
                System.out.println("Price must be greater than 0. Enter again:");
                price = sc.nextInt();
            }
            phoneObj[i] = new Phone(phoneId, os, Brand, price);
        }
        String brandInput = sc.nextLine();
        String OsInput = sc.nextLine();

        int sumResult = findPriceForGivenBrand(phoneObj, brandInput);
        if (sumResult > 0) {
            System.out.println(sumResult);
        } else {
            System.out.println("THe given Brand is not avaialbale");
        }
        Phone temp = getPhoneIdBasedOnOs(phoneObj, OsInput);
        if (temp == null) {
            System.out.println("No phones are available");
        } else {
            System.out.println(temp);
        }
        sc.close();
    }

    public static int findPriceForGivenBrand(Phone[] obj, String brandInput) {
        int sum = 0;
        for (int i = 0; i < obj.length; i++) {
            if (obj[i].getBrand().equalsIgnoreCase(brandInput)) {
                sum += obj[i].getPrice();
            }
        }
        if (sum > 0) {
            return sum;
        }
        return 0;

    }

    public static Phone getPhoneIdBasedOnOs(Phone[] obj, String os) {
        Phone temp = null;
        for (int i = 0; i < obj.length; i++) {
            if (obj[i].getOs().equalsIgnoreCase(os) && obj[i].getPrice() >= 50000) {
                return obj[i];
            }
        }
        return temp;
    }
}
