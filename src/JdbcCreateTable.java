import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCreateTable {
    public static void main(String[] args){

        try(Connection connection = CreateConnection.createConnection();
            Statement statement = connection.createStatement()
        ){
            String creteSQL = "CREATE TABLE persons (person_id SERIAL NOT NULL , persone_name VARCHAR(100) NOT NULL , person_age INT NOT NULL, person_address VARCHAR(50), salary INT);";
            statement.executeUpdate(creteSQL);
            System.out.println("create table succefully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
