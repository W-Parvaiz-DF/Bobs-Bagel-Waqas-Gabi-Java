package BobsBagels;

import java.util.List;
import java.util.ArrayList;
public class Basket {


    List<Items> basket = new ArrayList<Items>();
    public int capacity = 5;


    public Basket() {
        //this.basket = basket;
    }

    public Basket(int capacity) {
        this.capacity = capacity;
    }

    public int getBasketSize(){
        return basket.size();
    }

    public void addItem(Items item){
        if(basket.contains(item)){
            System.out.println("Cannot add item already added.");
        }
        if(basket.size() < capacity) {
            System.out.println(item.getPrice());
            basket.add(item);
        }


    }

    public void removeItem(Items item){
        if(!basket.remove(item)){
            System.out.println("Cannot remove item that's not in basket.");
        }

    }

    public int getTotal() {
        int total = 0;
        for (int i=0; i < this.basket.size(); i++) {
            Items item = basket.get(i);
            int price = item.getPrice();
            total += price;
        }
        return total;
    }

}
