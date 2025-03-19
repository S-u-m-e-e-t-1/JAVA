import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class CreateTable {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/sumeet";
        String username = "root";
        String password = "180725";

        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password)) {
            String sql = "CREATE TABLE Users ("
                    + "id INT PRIMARY KEY AUTO_INCREMENT, "
                    + "name VARCHAR(100) NOT NULL, "
                    + "email VARCHAR(100) NOT NULL)";

            Statement statement = connection.createStatement();
            statement.execute(sql);

            System.out.println("Table created successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
