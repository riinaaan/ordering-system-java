package ordering;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DatabaseConnection {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/ordering";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = " ";

    public static Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error connecting to the database", "Database Connection Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

public static void close(Connection connection) {
    if (connection != null) {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error closing the database connection", "Database Connection Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
  
}

