import java.sql.PreparedStatement;

public class Main2 {

    public static void main(String[] args) throws Exception {

        new DB("jdbc:sqlite:./db.sql/sql.db");
        PreparedStatement insertmenu = DB.conn.prepareStatement("INSERT INTO MENUS (restaurant_id, name) VALUES (?, ?);");
        insertmenu.setInt(1, 6);
        insertmenu.setString(2, "DinnerBuffet");
        insertmenu.executeUpdate();

        new DB("jdbc:sqlite:./db.sql/sql.db");
        PreparedStatement insertdishes = DB.conn.prepareStatement("INSERT INTO dishes (menu_id, name) VALUES (?,?);");
        insertdishes.setInt(1, 1);
        insertdishes.setString(2, "Half Chicken and 2 sides");
        insertdishes.executeUpdate();


        new DB("jdbc:sqlite:./db.sql/sql.db");
        PreparedStatement insertrestaurants = DB.conn.prepareStatement("INSERT INTO restaurants (name, imageURL) VALUES (?,?);");
        insertrestaurants.setString(1, "FiveGuys");
        insertrestaurants.setString(2, "fiveguys.co.uk");
        insertrestaurants.executeUpdate();
    }

}
