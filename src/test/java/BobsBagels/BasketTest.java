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
        Items bread = new Items("Bread");
        testBasket.addItem(bread);
        assertEquals(1, testBasket.getBasketSize());

    }

    @Test
    public void RemovingItemFromBasket(){
        Basket testBasket = new Basket();
        Items bread = new Items("Bread");
        testBasket.addItem(bread);
        testBasket.removeItem(bread);
        assertEquals(0, testBasket.getBasketSize());

    }

    @Test
    public void NotAbleToAddOverCapacity(){
        Basket testBasket = new Basket(1);
        Items bread = new Items("Bread");
        testBasket.addItem(bread);
        testBasket.addItem(bread);
        assertEquals(1, testBasket.getBasketSize());
    }

    @Test
    public void cantRemoveNonexistentItem(){
        Basket testBasket = new Basket(1);
        Items bread = new Items("Bread");
        Items milk = new Items("Milk");
        testBasket.addItem(bread);
        testBasket.removeItem(milk);
        assertEquals(1, testBasket.getBasketSize());
    }

    @Test
    public void cantAddItemAlreadyInBasket(){
        Basket testBasket = new Basket(1);
        Items bread = new Items("Bread");
        testBasket.addItem(bread);
        testBasket.addItem(bread);
        assertEquals(1, testBasket.getBasketSize());

    }



}