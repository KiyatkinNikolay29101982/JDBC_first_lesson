import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {
    public static void main(String[] args){
        try(Connection connection = CreateConnection.createConnection();
            Statement statement = connection.createStatement()
        ){
            String updateSQL = "UPDATE persons SET salary = 120000 WHERE person_id = 2;";
            statement.executeUpdate(updateSQL);

            System.out.println("update table succefully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
