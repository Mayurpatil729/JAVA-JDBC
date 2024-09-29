
import java.sql.*;
import java.util.Scanner;

// Main Practice File

public class Main {

    // private static final String url="jdbc:mysql://localhost:3306/mydb";
    private static final String url = "jdbc:mysql://localhost:3306/Bank";
    private static final String username = "root";
    private static String password = "Mayurpatil729";

    public static void main(String[] args) {
        // TODO Auto-generated method
        try {
            Class.forName("con.mysql.cj.jdbc.Driver");

        }catch(ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection connection=DriverManager.getConnection(url,username,password);
//            Statement statement=connection.createStatement();


            // Using Statement
            // Retrieval
//            String query="select * from students";
//            ResultSet resultSet=statement.executeQuery(query);
//
//            while(resultSet.next()) {
//                int id=resultSet.getInt("id");
//                String name=resultSet.getString("name");
//                int age=resultSet.getInt("age");
//                double marks=resultSet.getDouble("marks");
//                System.out.println("id:"+id+" name:"+name+" age:"+age+" marks:"+marks);
//            }

//            // Insert
//            String query=String.format("INSERT INTO students(name,age,marks) VALUES('%s',%o,%f)","Rahul",23,74.5);
//            String query1=String.format("INSERT INTO students(name,age,marks) VALUES('%s',%o,%f)","Mohan",22,90.2);
//

//            int rowsAffected=statement.executeUpdate(query);
//            if(rowsAffected>0) {
//                System.out.println("Record Inserted");
//            }else{
//                System.out.println("Record Not Inserted");
//            }


            // Update
//            String query=String.format("UPDATE students SET marks =%f WHERE id= %d ",89.5,2); // marks update
//            int rowsAffected=statement.executeUpdate(query);
//            if(rowsAffected>0) {
//                System.out.println("Record Updated Successfully");
//            }else{
//                System.out.println("Record Not Updated Successfully");
//            }


            // Delete
//            String query="DELETE FROM students WHERE id=2"; // marks update
//            int rowsAffected=statement.executeUpdate(query);
//            if(rowsAffected>0) {
//                System.out.println("Record Deleted Successfully");
//            }else{
//                System.out.println("Record Not Deleted Successfully");
//            }




            // Using PreparedStatement
//            String query="INSERT INTO students(name,age,marks) VALUES(?,?,?)";
//            PreparedStatement preparedStatement=connection.prepareStatement(query);
//            preparedStatement.setString(1,"Alex");
//            preparedStatement.setInt(2,20);
//            preparedStatement.setDouble(3,84.7);
//            int rowsAffected=preparedStatement.executeUpdate();
//            if(rowsAffected>0){
//                System.out.println("Rows affected: "+rowsAffected);
//            }else {
//                System.out.println("No rows affected");
//            }

            // Retrieval
//            String query="select marks FROM students WHERE id=?";
//            PreparedStatement preparedStatement=connection.prepareStatement(query);
//            preparedStatement.setInt(1,1);
//            ResultSet resultSet=preparedStatement.executeQuery();
//            if(resultSet.next()){
//                double marks=resultSet.getDouble("marks");
//                System.out.println("Marks : "+marks);
//            }else {
//                System.out.println("Marks not found !! ");
//            }

            // Update
//            String query="UPDATE students SET name=? WHERE id=?";
//            PreparedStatement preparedStatement=connection.prepareStatement(query);
//            preparedStatement.setDouble(1,84.5);
//            preparedStatement.setInt(2,3);
//            int rowsAffected=preparedStatement.executeUpdate();
//            if(rowsAffected>0){
//                System.out.println("Data Updated Successfully Rows affected: "+rowsAffected);
//            }else{
//                System.out.println("No rows affected");
//            }


            // Delete
//            String query="DELETE FROM students WHERE id=?";



            // Batch Processing
//            Scanner scanner=new Scanner(System.in);
//            while(true){
//                System.out.println("Enter name:");
//                String name=scanner.nextLine();
//                System.out.println("Enter age :");
//                int age=scanner.nextInt();
//                System.out.println("Enter marks :");
//                String marks=scanner.nextLine();
//                System.out.println("Enter more data (Y/N): ");
//                String choice=scanner.nextLine();
//
//                  preparedStatement.setString(1,name);
//                  preparedStatement.setInt(2,age);
//                  preparedStatement.setDouble(3,marks);
//                  preparedStatement.addBatch();

//                String query=String.format("INSERT INTO students(name,age,marks) VALUES('%s',%d,'%s')", name,age,marks);
//                statement.addBatch(query);
//                if(choice.toUpperCase().equals("N")){
//                    break;
//                }
//            }
//            int[] arr=statement.executeBatch();
//                for(int i=0;i<arr.length;i++){
//                    if(arr[i]==0) {
//                        System.out.println("Query: " + i + " not executed Successfully ");
//                    }
//                }

//            **************************************************************************************************************************************


            // Transaction Handiling

            try {
                Connection connection1 = DriverManager.getConnection(url, username, password);
                connection1.setAutoCommit(false);
                String debit_query = "UPDATE accounts SET balance=balance-? WHERE account_number=?";
                String credit_query = "UPDATE accounts SET balance=balance-? WHERE account_number=?";
                PreparedStatement preparedStatement = connection.prepareStatement(debit_query);
                PreparedStatement preparedStatement1 = connection1.prepareStatement(credit_query);
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter account number : ");
                int account_number = scanner.nextInt();
                System.out.println("Enter balance : ");
                double balance = scanner.nextDouble();
                double amount = scanner.nextDouble();
                debitPreparedStatement.setDouble(1, amount);
                debitPreparedStatement.setInt(2, 101);
                creditPreparedStatement.setDouble(1, amount);
                creditPreparedStatement.setInt(2, 102);

                if (isSufficient(connection, 101, amount)) {
                    int affectedRows1 = debitPreparedStatement.executeUpdate();
                    int affectedRows2 = creditPreparedStatement.executeUpdate();
                } else {
                    System.out.println("You don't have sufficient balance");
                }

                debitPreparedStatement.executeUpdate();
                creditPreparedStatement.executeUpdate();
            }


        }catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }

    }

    static boolean isSuffient(Connection connection, int account_number, double amount) {

        try {
            String query = "SELECT balance FROM account WHERE account_number=?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, account_number);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                double current_balance = resultSet.getDouble("balance");
                if (amount > current_balance) {
                    return false;
                } else {
                    return true;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
