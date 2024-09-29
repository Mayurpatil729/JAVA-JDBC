<!-- @format -->

### Key Concepts Covered in the Program:

1. **JDBC Driver Loading:**

   - `Class.forName("com.mysql.cj.jdbc.Driver");` loads the MySQL JDBC driver to establish the connection.

2. **Database Connection:**

   - `DriverManager.getConnection(url, username, password);` establishes a connection to the MySQL database.

3. **Statement and PreparedStatement:**

   - `Statement` is used for executing simple SQL queries.
   - `PreparedStatement` allows executing parameterized SQL queries, which helps prevent SQL injection.

4. **CRUD Operations:**

   - Examples of `INSERT`, `SELECT`, `UPDATE`, and `DELETE` operations are demonstrated.

5. **Batch Processing:**

   - `addBatch()` and `executeBatch()` are used to perform multiple SQL operations in a single batch, improving efficiency.

6. **Transaction Handling:**

   - `setAutoCommit(false);` is used to disable auto-commit mode, allowing multiple SQL operations to be grouped into a transaction.
   - `commit()` finalizes the transaction, and `rollback()` undoes all changes if an error occurs.

7. **Exception Handling and Resource Management:**
   - The `try-catch-finally` block is used to handle exceptions and ensure that all resources (statements, prepared statements, connection) are properly closed.

---

### How to Run the Program:

1. Ensure you have a MySQL database running with a database named `mydb`.
2. Make sure the `students` table exists in the `mydb` database with the following structure:
   ```sql
   CREATE TABLE students (
       id INT AUTO_INCREMENT PRIMARY KEY,
       name VARCHAR(50),
       age INT,
       marks INT
   );
   ```
3. Compile and run the Java program in your preferred IDE or command line.

This program demonstrates the essential operations you'll need to work with MySQL databases using JDBC in Java.


---

