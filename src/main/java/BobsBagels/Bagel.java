package BobsBagels;

public class Bagel extends Items {

    public int price = 40;

    public Bagel(String name) {
        super(name);
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Bagel{" +
                "price=" + price +
                '}' + super.toString();
    }
}
