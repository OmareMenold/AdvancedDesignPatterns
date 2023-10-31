import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        DBConnection dbConnection = DBConnection.getInstance();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/testdatabase_menold";
            String user = "menold";
            String password = "hackWireshark";
            Connection connection = DriverManager.getConnection(url, user, password);
            if (connection != null) {
                System.out.println("Connected to the database test1");
            }

            Connection connection = dbConnection.getConnection(url, user, password);
            // Use the connection for database operations
        } catch (SQLException e) {
            e.printStackTrace();
        }

        DBConnection dbConnection2 = DBConnection.getInstance();
        try {
            Connection connection = dbConnection2.getConnection("jdbc:mysql://localhost:3306/testdatabase_menold", "menold", "hackWireshark");
            // Use the connection for database operations
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}