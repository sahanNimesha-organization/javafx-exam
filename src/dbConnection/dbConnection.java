package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
    public static class DBConnection {
        private static DBConnection dbconnection;
        private final Connection connection;

        private DBConnection() throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/JavaFX_Demo", "root", "sana");
        }

        public static DBConnection getInstance() throws ClassNotFoundException, SQLException {
            return (dbconnection == null) ? (dbconnection = new DBConnection()) : (dbconnection);
        }

        public Connection getConnection() {
            return connection;
        }
    }

}
