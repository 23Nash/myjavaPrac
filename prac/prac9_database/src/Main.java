
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/student"; // Replace with your database name
        String user = "root";                                          // Default user for XAMPP is 'root'
        String password = "";                                          // Default password is empty
        
        try {
            // Load and register MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish the connection
            Connection connection = DriverManager.getConnection(url, user, password);
            
            if (connection != null) {
                System.out.println("Connected to the database successfully!");
            } else {
                System.out.println("Failed to connect to the database.");
            }
            
            // Close the connection (optional here, but good practice)
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}

