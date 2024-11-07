import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // import the package
        // load and register
        // create connection
        // create statement
        // execute the statement
        // process the results
        // close

        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "2448";
        String sql = "select * from student";

        Connection con = DriverManager.getConnection(url,uname,pass);
        System.out.println("Connection established");
        Statement st = con.createStatement();


        
        con.close();
        System.out.println("Connection Closed");
    }
}