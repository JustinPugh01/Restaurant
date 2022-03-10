import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class Item {
    int id ;
    String dishname;
    double dishprice;
    int Menu_ID;

    public static void init(){
        try{
        Statement createTable = DB.conn.createStatement();
        createTable.execute("CREATE TABLE IF NOT EXISTS Dishes (ID INTEGER PRIMARY KEY, Menu_ID INTEGER , DishName TEXT , DishPrice INTEGER)"); 
    } catch(SQLException err){} }


    public Item(int Menu_ID, String dishname, double dishprice) {
        this.dishname = dishname;
        this.dishprice = dishprice ; 
        this.Menu_ID = Menu_ID;

        try{
            PreparedStatement insertdishes = DB.conn.prepareStatement("INSERT INTO Dishes (Menu_ID, DishName, DishPrice) VALUES (?, ?, ?);");
            insertdishes.setInt(1, this.Menu_ID);
            insertdishes.setString(2, this.dishname);
            insertdishes.setDouble(3, this.dishprice);
            insertdishes.executeUpdate();
            this.id = insertdishes.getGeneratedKeys().getInt(1);
            }catch (SQLException err){}
    }

    public String getItemName() {
        return this.dishname;

    }

    public void setItemPrice(double dishprice) {
        this.dishprice = dishprice;
    }


    public double getItemPrice() {
        return this.dishprice;
    }
}
