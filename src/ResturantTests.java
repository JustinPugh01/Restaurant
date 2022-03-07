import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ResturantTests {

    @Test

    public void resturantTest(){
        Resturant nandos = new Resturant("Nandos");
        assertEquals(nandos.getName(), "Nandos");
    }
    @Test
    public void imageurlTest(){
        Resturant nandos = new Resturant("Nandos");
        nandos.setImageurl("https://www.worcesternews.co.uk/resources/images/11399294.jpg?display=1&htype=52&type=responsive-gallery");
        assertEquals(nandos.getImageurl(), "https://www.worcesternews.co.uk/resources/images/11399294.jpg?display=1&htype=52&type=responsive-gallery");
    }
    @Test
    public void createfullresturantTest(){
        Resturant nandos = new Resturant("Nandos");
        Menu chickendishes = new Menu("Chicken dishes");
        Item halfchicken = new Item("Half chicken and chips");
        halfchicken.setItemPrice(5.85);
        chickendishes.addItem(halfchicken);
        nandos.addMenu(chickendishes);
        boolean isonLists=(nandos.getMenuList().contains(chickendishes));
        boolean ison2Lists=(chickendishes.getItemList().contains(halfchicken));
        assertEquals(isonLists, true);
        assertEquals(ison2Lists, true);
    }
}
