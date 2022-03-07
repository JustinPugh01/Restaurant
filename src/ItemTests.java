import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class ItemTests {


    @Test
    public void testItem(){
        Item FishandChips = new Item("Fish and Chips");
        assertEquals(FishandChips.getItemName(), "Fish and Chips");

    }
    @Test
    public void testPrice(){
        Item Burger = new Item("Beef Burger");
        Burger.setItemPrice(5.99);
        assertEquals(Burger.getItemName(), "Beef Burger");
        assertEquals(Burger.getItemPrice(),5.99,0);

    }

    
}
