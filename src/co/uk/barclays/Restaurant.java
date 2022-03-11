package co.uk.barclays;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Restaurant {
    private int id;
    private String name;
    private String imageURL;
    private ArrayList<Menu> menulist = new ArrayList();
    public static ArrayList<Restaurant> allRestaurants = new ArrayList();

    public static void init(){
        try{
        Statement createTable = DB.conn.createStatement();
        createTable.execute("CREATE TABLE IF NOT EXISTS restaurants (ID INTEGER PRIMARY KEY, NAME TEXT , ImageURL TEXT);"); 
        Statement getrestaurants = DB.conn.createStatement();
        ResultSet restaurants = getrestaurants.executeQuery("SELECT * FROM restaurants");
        while(restaurants.next()){
            int id = restaurants.getInt(1);
            String name = restaurants.getString(2);
            String imageURL = restaurants.getString(3);
            new Restaurant(id, name, imageURL);
        }
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
        allRestaurants.add(this);
        }catch (SQLException err){}
    }
    public Restaurant(int id, String name , String imageURL){
        this.id = id;
        this.name = name;
        this.imageURL = imageURL;

        Restaurant.allRestaurants.add(this);
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
