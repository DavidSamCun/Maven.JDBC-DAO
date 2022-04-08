import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class ConnectionFactory {
    public static final String URL = "jdbc:mysql://localhost:3306/jdbc";
    public static final String User = "master";
    public static final String Pass = "admin";

    public static Connection getConnection(){
        try {
            DriverManager.registerDriver(new Driver());
            return DriverManager.getConnection(URL, User, Pass);
        } catch (SQLException ex){
            throw new RuntimeException("Error Connecting to the Database", ex);
        }
    }

    public static void main(String[] args) {
        Connection connection = ConnectionFactory.getConnection();
    }

}
