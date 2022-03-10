
import java.sql.PreparedStatement;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

public class Main3 {

    public static void main(String[] args) throws Exception {

      // Creating restaurants in the database through creating Restaurant objects in java 
      /* new DB("jdbc:sqlite:./db.sql/sql.db");
       Restaurant restaurant = new Restaurant("Burger Experts", "http://burger-experts.jpg");
       DB.conn.close(); */

       /*new DB("jdbc:sqlite:./db.sql/sql.db");
       Menu menu = new Menu(12, "Beyond meet Burgers" );
       DB.conn.close();*/

      /*new DB("jdbc:sqlite:./db.sql/sql.db");
      Item item = new Item(5, "All day Brunch", 7.05);
      Item item1 = new Item(5, "Vegertarian all day brunch", 7.05 );
      Item item2 = new Item(7, "Ham , eggs and chips", 5.35);
      Item item3 = new Item(7, "Chicken strips and chips", 7.35);
      DB.conn.close();*/

      // Creating restaurant objects in java by reading data from database 

      new DB("jdbc:sqlite:./db.sql/sql.db");
      Restaurant.init();
      DB.conn.close();




       
    }
}