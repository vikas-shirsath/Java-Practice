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

        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection("","","");


    }
}
