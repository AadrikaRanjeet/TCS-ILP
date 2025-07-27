import java.util.*;

class Footwear {
    private int footwearId;
    private String footwearName;
    private String footwearType;
    private int price;

    Footwear(int footwearId, String footwearName, String footwearType, int price) {
        this.footwearId = footwearId;
        this.footwearName = footwearName;
        this.footwearType = footwearType;
        this.price = price;
    }

    // Getters
    public int getFootwearId() {
        return footwearId;
    }

    public String getFootwearName() {
        return footwearName;
    }

    public String getFootwearType() {
        return footwearType;
    }

    public int getPrice() {
        return price;
    }

    // Setters
    public void setFootwearId(int footwearId) {
        this.footwearId = footwearId;
    }

    public void setFootwearName(String footwearName) {
        this.footwearName = footwearName;
    }

    public void setFootwearType(String footwearType) {
        this.footwearType = footwearType;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class FootwearProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Footwear[] obj = new Footwear[5];
        for (int i = 0; i < obj.length; i++) {
            int id = sc.nextInt();
            String name = sc.nextLine();
            String type = sc.nextLine();
            int price = sc.nextInt();

            obj[i] = new Footwear(id, name, type, price);
        }
        String searchType = sc.nextLine();
        String searchBrand = sc.nextLine();
        int count = getCountByType(obj, searchType);
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("Footwear not available");
        }
        // 2. Get second highest price
        Footwear second = getSecondHighestPriceByBrand(obj, searchBrand);
        if (second != null) {
            System.out.println(second.getFootwearId());
            System.out.println(second.getFootwearName());
            System.out.println(second.getPrice());
        } else {
            System.out.println("Brand not available");
        }

        sc.close();
    }

    public static int getCountByType(Footwear[] obj, String footwearType) {
        int count = 0;
        for (int i = 0; i < obj.length; i++) {
            if (obj[i].getFootwearType().equalsIgnoreCase(footwearType)) {
                count++;
            }
        }
        return count;
    }

    public static Footwear getSecondHighestPriceByBrand(Footwear[] obj, String input) {
        ArrayList<Footwear> list = new ArrayList<>();
        for (int i = 0; i < obj.length; i++) {
            if (obj[i].getFootwearName().equalsIgnoreCase(input)) {
                list.add(obj[i]);
            }

        }
        if (list.size() < 2) {
            return null;
        }
        // Sort by price descending
        list.sort((a, b) -> b.getPrice() - a.getPrice());

        // Return second highest
        return list.get(1);
    }

}