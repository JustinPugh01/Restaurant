import java.sql.PreparedStatement;

public class Main2 {

    public static void main(String[] args) throws Exception {

        new DB("jdbc:sqlite:./db.sql/sql.db");
        PreparedStatement insertrestaurants = DB.conn.prepareStatement("INSERT INTO restaurants (name, imageURL) VALUES (?,?);");
        insertrestaurants.setString(1, "FiveGuys");
        insertrestaurants.setString(2, "fiveguys.co.uk");
        insertrestaurants.executeUpdate();
    }

}
