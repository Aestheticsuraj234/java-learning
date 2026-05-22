package enums;

enum Laptops {
    DELL(2000), HP(1500), MACBOOK(3000), ASUS(1800);

    private int price;

    private Laptops() {
    }

    private Laptops(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    

}
public class enums {
    public static void main(String[] args) {
        Laptops lap = Laptops.DELL;
        System.out.println(lap);
        System.out.println(lap.getPrice());

    }
}
