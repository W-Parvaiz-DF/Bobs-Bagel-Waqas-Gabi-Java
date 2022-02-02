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
            basket.add(item);
        }


    }

    public void removeItem(Items item){
        if(!basket.remove(item)){
            System.out.println("Cannot remove item that's not in basket.");
        }

    }

}
