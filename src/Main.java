import java.sql.PreparedStatement;

public class Main {

    public static void main(String[] args) throws Exception {
       new DB("jdbc:sqlite:./db.sql/sql.db");
       PreparedStatement insertrestaurants = DB.conn.prepareStatement("INSERT INTO restaurants (name) VALUES (?);");
       String[]restaurants = {
            "Harvester",
            "Chinese buffet",
            "Chilies"
        };
        for(String restaurant : restaurants) {
            insertrestaurants.setString(1, restaurant);
            insertrestaurants.executeUpdate();
        }
    }

    
    
}
