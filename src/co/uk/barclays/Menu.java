package co.uk.barclays;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Menu {
    private int id;
    private int restaurant_id;
    private String menuname;
    private ArrayList<Item> itemlist = new ArrayList();

    public static void init(){
        try{
        Statement createTable = DB.conn.createStatement();
        createTable.execute("CREATE TABLE IF NOT EXISTS menus (ID INTEGER PRIMARY KEY, RESTAURANT_ID INTEGER , NAME TEXT);"); 
    } catch(SQLException err){} }



    public Menu(int restaurant_id, String menuname) {
        this.menuname = menuname;
        this.restaurant_id = restaurant_id;

            try{
            PreparedStatement insertmenus = DB.conn.prepareStatement("INSERT INTO menus (RESTAURANT_ID, NAME) VALUES (?, ?);");
            insertmenus.setInt(1, this.restaurant_id);
            insertmenus.setString(2, this.menuname);
            insertmenus.executeUpdate();
            this.id = insertmenus.getGeneratedKeys().getInt(1);
            }catch (SQLException err){}
        

    }

    public String getMenuName() {
        return this.menuname;
    }
    
    public void addItem(Item item) {
        itemlist.add(item);
    }

    public ArrayList<Item> getItemList() {
        return this.itemlist;
    }
}