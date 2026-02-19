import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public Connection getConnection() {
        try {
            String DB_URL = System.getenv("DB_URL");
            String DB_USER = System.getenv("DB_USER");
            String DB_PASSWORD = System.getenv("DB_PASSWORD");
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
