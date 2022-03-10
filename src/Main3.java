
import java.sql.PreparedStatement;

public class Main3 {

    public static void main(String[] args) throws Exception {
      /* new DB("jdbc:sqlite:./db.sql/sql.db");
       Restaurant restaurant = new Restaurant("Burger Experts", "http://burger-experts.jpg");
       DB.conn.close(); */

       /*new DB("jdbc:sqlite:./db.sql/sql.db");
       Menu menu = new Menu(12, "Beyond meet Burgers" );
       DB.conn.close();*/

       new DB("jdbc:sqlite:./db.sql/sql.db");
      // Item item = new Item(12, "Vegan BBQ substitue burger", 6.99);
      // DB.conn.close();

      Item item = new Item(5, "All day Brunch", 7.05);
      Item item1 = new Item(5, "Vegertarian all day brunch", 7.05 );
      Item item2 = new Item(7, "Ham , eggs and chips", 5.35);
      Item item3 = new Item(7, "Chicken strips and chips", 7.35);



       
    }
}