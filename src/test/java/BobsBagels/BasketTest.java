package BobsBagels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BasketTest{

    @Test
    public void BasketIsEmptyInitially() {
        Basket testBasket = new Basket();
        assertEquals(0, testBasket.getBasketSize());
    }

    @Test
    public void AddingItemToBasket(){
        Basket testBasket = new Basket();
        Bagel bread = new Bagel("Bread");
        testBasket.addItem(bread);
        assertEquals(1, testBasket.getBasketSize());

    }

    @Test
    public void RemovingItemFromBasket(){
        Basket testBasket = new Basket();
        Bagel bread = new Bagel("Bread");
        testBasket.addItem(bread);
        testBasket.removeItem(bread);
        assertEquals(0, testBasket.getBasketSize());

    }

    @Test
    public void NotAbleToAddOverCapacity(){
        Basket testBasket = new Basket(1);
        Bagel bread = new Bagel("Bread");
        testBasket.addItem(bread);
        testBasket.addItem(bread);
        assertEquals(1, testBasket.getBasketSize());
    }

    @Test
    public void cantRemoveNonexistentItem(){
        Basket testBasket = new Basket(1);
        Bagel bread = new Bagel("Bread");
        Bagel milk = new Bagel("Milk");
        testBasket.addItem(bread);
        testBasket.removeItem(milk);
        assertEquals(1, testBasket.getBasketSize());
    }

    @Test
    public void cantAddItemAlreadyInBasket(){
        Basket testBasket = new Basket(1);
        Bagel bread = new Bagel("Bread");
        testBasket.addItem(bread);
        testBasket.addItem(bread);
        assertEquals(1, testBasket.getBasketSize());

    }

    @Test
    public void getPriceOfItem() {
        Bagel bagel = new Bagel("Onion");
        assertEquals(40, bagel.getPrice());
    }

    @Test
    public void getFullBasketPrice() {
        Basket testBasket = new Basket(3);
        Bagel bagel1 = new Bagel("Onion");
        Bagel bagel2 = new Bagel("Everything");
        Bagel bagel3 = new Bagel("Salmon");
        testBasket.addItem(bagel1);
        testBasket.addItem(bagel2);
        testBasket.addItem(bagel3);
        int fullPrice = testBasket.getTotal();
        assertEquals(120, fullPrice);
    }




}