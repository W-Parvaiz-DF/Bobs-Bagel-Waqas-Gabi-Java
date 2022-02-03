package BobsBagels;

public abstract class Items {

    public String name;

    public Items(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getPrice();

    @Override
    public String toString() {
        return "Items{" +
                "name='" + name + '\'' +
                '}';
    }
}
