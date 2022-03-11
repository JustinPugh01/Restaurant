package co.uk.barclays;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
    public static Connection conn;

    public DB(String connectionString) {
        try {
            DB.conn = DriverManager.getConnection(connectionString);
            Statement createTables = DB.conn.createStatement();
        } catch (SQLException error) {
            System.out.println(error.getMessage());
        }

    }

}
