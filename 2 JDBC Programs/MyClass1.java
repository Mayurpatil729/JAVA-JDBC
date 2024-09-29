package 2 JDBC Programs;

public

import java.Sql*;

public class MyClass1 {

    private static final String url = "";
    private static final String username = "root";
    private static String password="Mayurpatil729"

    public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("con.mysql.cj.jdbc.Driver");
			
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			Connection connection=DriverManager.getConnection(url,username,password)
			Statement statement=connection.createStatement();
					
		}catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
