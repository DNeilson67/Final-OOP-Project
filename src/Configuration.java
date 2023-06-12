import java.sql.*;
public class Configuration {
    private static Connection MySQLConfig;
    public static Connection configDB() throws SQLException{
            String url = "jdbc:mysql://localhost:3306/jewelry";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url, user, pass);
            return MySQLConfig;
    }

}
