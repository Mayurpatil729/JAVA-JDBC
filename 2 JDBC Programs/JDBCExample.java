import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

// Performing CRUD Operations : GPT Generated Code

public class JDBCExample {
    // Database connection details
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";
    private static final String password = "Mayurpatil729";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database using DriverManager
            connection = DriverManager.getConnection(url, username, password);

            // Create a Statement object for executing SQL queries
            statement = connection.createStatement();

            // Perform CRUD operations using Statement
            // Example: Insert a record
            String insertQuery = "INSERT INTO students (name, age, marks) VALUES ('John Doe', 20, 85)";
            int rowsInserted = statement.executeUpdate(insertQuery);
            System.out.println("Rows inserted: " + rowsInserted);

            // Example: Retrieve and display records
            String selectQuery = "SELECT * FROM students";
            ResultSet resultSet = statement.executeQuery(selectQuery);
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id") + ", Name: " + resultSet.getString("name") +
                        ", Age: " + resultSet.getInt("age") + ", Marks: " + resultSet.getInt("marks"));
            }

            // Perform CRUD operations using PreparedStatement
            // Example: Insert a record with parameters
            String preparedQuery = "INSERT INTO students (name, age, marks) VALUES (?, ?, ?)";
            preparedStatement = connection.prepareStatement(preparedQuery);
            preparedStatement.setString(1, "Jane Smith");
            preparedStatement.setInt(2, 22);
            preparedStatement.setInt(3, 90);
            int preparedRowsInserted = preparedStatement.executeUpdate();
            System.out.println("Rows inserted using PreparedStatement: " + preparedRowsInserted);

            // Batch Processing Example
            // Add multiple SQL statements to a batch
            preparedStatement.setString(1, "Alice");
            preparedStatement.setInt(2, 23);
            preparedStatement.setInt(3, 88);
            preparedStatement.addBatch();

            preparedStatement.setString(1, "Bob");
            preparedStatement.setInt(2, 21);
            preparedStatement.setInt(3, 92);
            preparedStatement.addBatch();

            // Execute the batch
            int[] batchResults = preparedStatement.executeBatch();
            System.out.println("Batch processing results:");
            for (int result : batchResults) {
                System.out.println("Result: " + result);
            }

            // Transaction Handling Example
            try {
                // Disable auto-commit mode
                connection.setAutoCommit(false);

                // Perform multiple operations as part of a transaction
                String updateQuery = "UPDATE students SET marks = ? WHERE name = ?";
                preparedStatement = connection.prepareStatement(updateQuery);
                preparedStatement.setInt(1, 95);
                preparedStatement.setString(2, "John Doe");
                preparedStatement.executeUpdate();

                String deleteQuery = "DELETE FROM students WHERE name = ?";
                preparedStatement = connection.prepareStatement(deleteQuery);
                preparedStatement.setString(1, "Bob");
                preparedStatement.executeUpdate();

                // Commit the transaction
                connection.commit();
                System.out.println("Transaction committed successfully.");

            } catch (SQLException e) {
                // Rollback the transaction in case of an error
                if (connection != null) {
                    try {
                        connection.rollback();
                        System.out.println("Transaction rolled back due to error.");
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            // Handle error if the JDBC driver class is not found
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            // Handle SQL-related errors
            e.printStackTrace();
        } finally {
            // Close the resources in the finally block to ensure they are always closed
            try {
                if (statement != null)
                    statement.close();
                if (preparedStatement != null)
                    preparedStatement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
