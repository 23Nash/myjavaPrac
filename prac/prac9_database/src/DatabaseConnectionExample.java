import java.sql.*;

public class DatabaseConnectionExample {
public static void main(String[] args) {
try {
// Load the JDBC driver


Class.forName("com.mysql.cj.jdbc.Driver");
// Establish the connection
String url = "jdbc:mysql://localhost:3306/student";
String username = "root";
String password = "";
Connection connection = DriverManager.getConnection(url, username, password);

// Create a statement
Statement statement = connection.createStatement();

// Execute an INSERT query

String sql = "INSERT INTO ce (name, roll_no, email, age) VALUES (?, ?, ?, ?)";
try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
    preparedStatement.setString(1, "John Doe");
    preparedStatement.setInt(2, 1357);
    preparedStatement.setString(3, "jon@gmail.com");
    preparedStatement.setInt(4, 30);
    
    int rowsAffected = preparedStatement.executeUpdate();
    System.out.println("Rows affected: " + rowsAffected);
} catch (SQLException e) {
    e.printStackTrace();
}



// Execute a SELECT query
ResultSet resultSet = statement.executeQuery("SELECT * FROM ce");
while (resultSet.next()) {
String name = resultSet.getString("name");
int age = resultSet.getInt("age");
System.out.println("Name: " + name + ", Age: " + age);
}


// Close resources
resultSet.close();


statement.close();
connection.close();
} catch (ClassNotFoundException | SQLException e) {
e.printStackTrace();
}
}
}
