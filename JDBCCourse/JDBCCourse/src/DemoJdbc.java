import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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

        Class.forName("org.postgresql.Driver");  //not compulsory

        Connection con = DriverManager.getConnection(url,uname,pass);

        System.out.println("Connection established");


    }
}
