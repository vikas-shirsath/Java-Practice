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
        String sql = "select sname from student where sid = 1";

        Class.forName("org.postgresql.Driver");  //not compulsory

        Connection con = DriverManager.getConnection(url,uname,pass);

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql); //for fetching data
        System.out.println("Connection established");
        System.out.println(rs.next());
        con.close();
        System.out.println("Connection Closed");
        rs.next();

        String name = rs.getString("sname");
        System.out.println("Name of a student is "+name);
    }
}