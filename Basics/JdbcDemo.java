import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) throws Exception {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con = DriverManager.getConnection("jdbc:odbc:demodsn", "scott", "tiger");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from employees");
        while (rs.next()) {
            System.out
                    .println(rs.getInt(1) + ".." + rs.getString(2) + ".." + rs.getDouble(3) + "..." + rs.getString(4));
        }
        con.close();
    }
}
