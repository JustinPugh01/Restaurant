import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CRUDTests {
    @Before
    public void SetUp(){
        new DB("jdbc:sqlite:memory");

    }
    @Test
    public void CanWeConnect(){
        assertTrue(DB.conn instanceof Connection);
    }
    @Test(expected = Test.None.class)
    public void dbIsProvisioned() throws SQLException {
        Statement checkSelect = DB.conn.createStatement();
        checkSelect.execute("SELECT * FROM restaurants;");
    }
    @Test
    public void create()throws SQLException{
       PreparedStatement insert = DB.conn.prepareStatement("INSERT INTO restaurants (name) Values (?);");
       insert.setString(1, "Nandos");
       insert.executeUpdate();
       Statement getRestaurant = DB.conn.createStatement();
       ResultSet results = getRestaurant.executeQuery("SELECT * from restaurants;");
       while(results.next()){
           assertEquals(results.getString(2), "Nandos");
       }
    }

    @After
    public void closeSetUP()throws SQLException{
        DB.conn.close();
    }

    
}
