import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Restaurant {
    private int id;
    private String name;
    private String imageURL;
    private ArrayList<Menu> menulist = new ArrayList();

    public static void init(){
        try{
        Statement createTable = DB.conn.createStatement();
        createTable.execute("CREATE TABLE IF NOT EXISTS restaurants (ID INTEGER PRIMARY KEY, NAME TEXT , IMAGEURL TEXT);"); 
    } catch(SQLException err){} }

 
 
    public Restaurant(String name, String imageURL  ) {
        this.name = name ; 
        this.imageURL = imageURL;

        try{
        PreparedStatement insertrestaurants = DB.conn.prepareStatement("INSERT INTO restaurants (name, imageURL) VALUES (?, ?);");
        insertrestaurants.setString(1, this.name);
        insertrestaurants.setString(2, this.imageURL);
        insertrestaurants.executeUpdate();
        this.id = insertrestaurants.getGeneratedKeys().getInt(1);
        }catch (SQLException err){}
    }

    public String getName() {
        return this.name;
    }
    public String getImageurl() {
        return this.imageURL ;
    }
    public void addMenu(Menu menu){
        menulist.add(menu);
    }

    public ArrayList<Menu> getMenuList() {
        return this.menulist;
    }
}
