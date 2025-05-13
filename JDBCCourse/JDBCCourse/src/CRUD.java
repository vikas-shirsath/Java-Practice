import java.sql.*;

public class CRUD {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uName = "postgres";
        String pass = "2448";
        String sql = "insert into student values (?, ?, ?)";
//        String sql = "update student set sname='Max' where sid=5";
//        String sql = "delete from student where sid=5";

        int sid = 102;
        String sName = "Jasmin";
        int marks = 60;

        Connection con = DriverManager.getConnection(url, uName, pass);

        PreparedStatement st = con.prepareStatement(sql);
        st.setInt(1,sid);
        st.setString(2, sName);
        st.setInt(3,marks);
//        st.execute(sql);//returns false for insertion and update
        int rowsAffected = st.executeUpdate();
        System.out.println("No of affected rows are : "+ rowsAffected);

        con.close();

    }
}